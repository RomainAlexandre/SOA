package fr.unice.polytech.soa1.fedps.webservice.customer.privatews;

import fr.unice.polytech.soa1.fedps.business.*;
import fr.unice.polytech.soa1.fedps.webservice.BadQuoteFault;
import fr.unice.polytech.soa1.fedps.webservice.UnknownCustomerFault;
import fr.unice.polytech.soa1.fedps.webservice.UnknownQuoteFault;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

@Stateless(name = "FedPSCustomerPrivate")
@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/romain/fedps/private/customer",
        portName = "FedPSCustomerPrivatePort",
        serviceName = "FedPSCustomerPrivateService",
        endpointInterface = "fr.unice.polytech.soa1.fedps.webservice.customer.privatews.CustomerPrivateWs")
public class CustomerPrivateWsImpl implements CustomerPrivateWs {
    @EJB
    private DataAccessObject dao;

    @Override
    public Quote createQuote(int parcelWidth, int parcelHeight, int parcelDepth, int parcelWeight, String sender_name, Address sender, String receiver_name, Address receiver, long pickupTimeStamp) throws UnknownCustomerFault {
        Customer c = dao.getCustomerByName(sender_name);
        if (c == null) {
            throw new UnknownCustomerFault(sender_name);
        }

        String pickupDate = new SimpleDateFormat("dd/MM/yyyy-HH:mm").format(new Timestamp(pickupTimeStamp));
        Parcel p = new Parcel(parcelWidth, parcelHeight, parcelDepth, parcelWeight, sender_name, sender, receiver_name, receiver, pickupDate);

        String quoteId = "Q1W2E3R4T5YID";

        String etaDate = new SimpleDateFormat("dd/MM/yyyy-HH:mm").format(new Timestamp(pickupTimeStamp+345600));

        double discountValue = c.getTemporaryDiscount() + c.getPermanentDiscount();
        double cost = 50 - (50 * (discountValue / 100));
        Quote q = new Quote(quoteId, p, cost, etaDate);
        dao.addQuoteNonOrdered(q);
        return q;
    }

    @Override
    public Quote updatePickupDate(String quote_id, long pickupTimeStamp) throws UnknownQuoteFault {
        Quote quote = dao.getQuoteNonOrderedById(quote_id);
        String pickupDate = new SimpleDateFormat("dd/MM/yyyy-HH:mm").format(new Timestamp(pickupTimeStamp));
        if (quote != null) {
            Parcel p = quote.getParcel();
            p.setPickupDate(pickupDate);
            return quote;
        } else {
            throw new UnknownQuoteFault(quote_id);
        }
    }

    @Override
    public Quote orderQuote(String quote_id) throws UnknownQuoteFault,BadQuoteFault {
        Quote quote = dao.getQuoteNonOrderedById(quote_id);
        if (quote != null) {
            SimpleDateFormat pickup_sdf = new SimpleDateFormat("dd/MM/yyyy-HH:mm");
            try {
                Date pickupDate = pickup_sdf.parse(quote.getParcel().getPickupDate());
                GregorianCalendar now = new GregorianCalendar();
                GregorianCalendar pickupCalendar = new GregorianCalendar();
                pickupCalendar.setTime(pickupDate);

                if (pickupCalendar.before(now)) {
                    throw new BadQuoteFault("Current pickup_date is in the past ! You have to update (operation updateQuote) or create a new quote (operation createQuote)");
                }
            } catch (ParseException e) {
                return null;
            }
            String parcelId = "A1Z2E3R4T5YID";
            Parcel p = quote.getParcel();
            p.setParcelId(parcelId);
            p.setStatus(ParcelStatus.STORAGE);

            dao.getQuotesNonOrdered().remove(quote);
            dao.addParcels(p);
            dao.addQuoteOrdered(quote);
            return quote;
        } else {
            throw new UnknownQuoteFault(quote_id);
        }
    }
}
