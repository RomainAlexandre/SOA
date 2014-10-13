package fr.unice.polytech.soa1.alexandr.webservice.customer.publicws;

import fr.unice.polytech.soa1.alexandr.business.Address;
import fr.unice.polytech.soa1.alexandr.business.ParcelStatus;
import fr.unice.polytech.soa1.alexandr.business.Quote;
import fr.unice.polytech.soa1.alexandr.webservice.BadQuoteFault;
import fr.unice.polytech.soa1.alexandr.webservice.UnknownCustomerFault;
import fr.unice.polytech.soa1.alexandr.webservice.UnknownParcelFault;
import fr.unice.polytech.soa1.alexandr.webservice.UnknownQuoteFault;

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
