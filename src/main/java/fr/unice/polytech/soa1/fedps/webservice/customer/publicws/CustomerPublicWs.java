package fr.unice.polytech.soa1.fedps.webservice.customer.publicws;

import fr.unice.polytech.soa1.fedps.business.ParcelStatus;
import fr.unice.polytech.soa1.fedps.webservice.UnknownParcelFault;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/romain/fedps/public/customer")
public interface CustomerPublicWs {
    @WebMethod(operationName = "get_status_by_parcel_reference")
    @WebResult(name = "ParcelStatus")
    public ParcelStatus getStatusByParcelRef(@WebParam(name = "parcelRef") String parcelRef) throws UnknownParcelFault;
}
