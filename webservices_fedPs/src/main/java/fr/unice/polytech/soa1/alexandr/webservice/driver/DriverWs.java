package fr.unice.polytech.soa1.alexandr.webservice.driver;

import fr.unice.polytech.soa1.alexandr.business.ParcelStatus;
import fr.unice.polytech.soa1.alexandr.business.Round;
import fr.unice.polytech.soa1.alexandr.webservice.UnknownParcelFault;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/romain/fedps/driver")
public interface DriverWs {
    @WebMethod(operationName = "get_round")
    @WebResult(name = "round")
    public Round getRound();

    @WebMethod(operationName = "set_parcel_status")
    @WebResult(name = "success")
    public boolean setParcelStatus(@WebParam(name = "parcel_ref") String parcelRef, @WebParam(name = "new_status") ParcelStatus newStatus) throws UnknownParcelFault;
}
