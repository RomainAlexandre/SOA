package fr.unice.polytech.soa1.alexandr.webservice.customer.publicws;

import fr.unice.polytech.soa1.alexandr.business.DataAccessObject;
import fr.unice.polytech.soa1.alexandr.business.ParcelStatus;
import fr.unice.polytech.soa1.alexandr.webservice.UnknownParcelFault;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless(name = "FedPSCustomerPublic")
@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/romain/fedps/public/customer",
        portName = "FedPSCustomerPublicPort",
        serviceName = "FedPSCustomerPublicService",
        endpointInterface = "fr.unice.polytech.soa1.alexandr.webservice.customer.publicws.CustomerPublicWs")
public class CustomerPublicWsImpl implements CustomerPublicWs {
    @EJB
    private DataAccessObject dao;

    @Override
    public ParcelStatus getStatusByParcelRef(String parcelRef) throws UnknownParcelFault{
        ParcelStatus res = dao.getStatusByParcelRef(parcelRef);
        if (res != null) {
            return res;
        }

        throw new UnknownParcelFault(parcelRef);
    }
}
