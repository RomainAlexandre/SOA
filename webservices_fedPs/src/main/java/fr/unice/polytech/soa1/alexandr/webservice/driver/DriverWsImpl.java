package fr.unice.polytech.soa1.alexandr.webservice.driver;

import fr.unice.polytech.soa1.alexandr.business.DataAccessObject;
import fr.unice.polytech.soa1.alexandr.business.ParcelStatus;
import fr.unice.polytech.soa1.alexandr.business.Round;
import fr.unice.polytech.soa1.alexandr.webservice.UnknownParcelFault;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless(name = "FedPSDriver")
@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/romain/fedps/driver",
        portName = "FedPSDriverPort",
        serviceName = "FedPSDriverService",
        endpointInterface = "fr.unice.polytech.soa1.alexandr.webservice.driver.DriverWs")
public class DriverWsImpl implements DriverWs{
    @EJB
    private DataAccessObject dao;

    @Override
    public Round getRound() {
        return dao.getRound();
    }

    @Override
    public boolean setParcelStatus(String parcelRef, ParcelStatus newStatus) throws UnknownParcelFault {
        if(dao.setParcelStatus(parcelRef, newStatus)){
            return true;
        } else{
            throw new UnknownParcelFault(parcelRef);
        }
    }
}
