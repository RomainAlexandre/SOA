package fr.unice.polytech.soa1.alexandr.webservice.customer.privatews;

import fr.unice.polytech.soa1.alexandr.business.Address;
import fr.unice.polytech.soa1.alexandr.business.ParcelStatus;
import fr.unice.polytech.soa1.alexandr.business.Quote;
import fr.unice.polytech.soa1.alexandr.webservice.BadQuoteFault;
import fr.unice.polytech.soa1.alexandr.webservice.UnknownCustomerFault;
import fr.unice.polytech.soa1.alexandr.webservice.UnknownQuoteFault;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/romain/fedps/private/customer")
public interface CustomerPrivateWs {
    @WebMethod(operationName = "create_quote")
    @WebResult(name = "quote")
    public Quote createQuote(@WebParam(name = "parcel_width") int parcelWidth,
                             @WebParam(name = "parcel_height") int parcelHeight,
                             @WebParam(name = "parcel_depth") int parcelDepth,
                             @WebParam(name = "parcel_weight") int parcelWeight,
                             @WebParam(name = "sender_name") String sender_name,
                             @WebParam(name = "sender") Address sender,
                             @WebParam(name = "receiver_name") String receiver_name,
                             @WebParam(name = "receiver") Address receiver,
                             @WebParam(name = "pickup_date_timestamp") long pickupTimeStamp) throws UnknownCustomerFault;

    @WebMethod(operationName = "update_quote")
    @WebResult(name = "quote")
    public Quote updatePickupDate(@WebParam(name = "quote_id") String quote_id,
                                  @WebParam(name = "pickup_date_timestamp") long pickupTimeStamp) throws UnknownQuoteFault;

    @WebMethod(operationName = "order_quote")
    @WebResult(name = "order")
    public Quote orderQuote(@WebParam(name = "quote_id") String quote_id) throws UnknownQuoteFault, BadQuoteFault;
}
