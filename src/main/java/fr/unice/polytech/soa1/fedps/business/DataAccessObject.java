package fr.unice.polytech.soa1.fedps.business;

import javax.ejb.Singleton;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Singleton(name = "FedPS-DB-Mock")
public class DataAccessObject {
    private List<Parcel> parcels;
    private List<Quote> quotesNonOrdered;
    private List<Quote> orders;
    private Round round;
    private Map<ParcelStatus, List<Parcel>> parcelByStatus;
    private List<Customer> customers;

    // GETTER
    public List<Customer> getCustomers() {
        return customers;
    }

    public Customer getCustomerByName(String name) {
        for (Customer c : customers) {
            if (c.getName().equals(name)) {
                return c;
            }
        }

        return null;
    }

    public List<Parcel> getParcels() {
        return parcels;
    }

    public Parcel getParcelByRef(String parcelRef) {
        for (Parcel p : parcels) {
            if (p.getParcelId().equals(parcelRef)) {
                return p;
            }
        }

        return null;
    }

    public List<Quote> getQuotesNonOrdered() {
        return quotesNonOrdered;
    }

    public List<Quote> getOrders() {
        return orders;
    }

    public Round getRound() {
        return round;
    }

    public Map<ParcelStatus, List<Parcel>> getMapParcelByStatus() {
        return parcelByStatus;
    }

    public Quote getQuoteNonOrderedById(String quote_id) {
        for (Quote q : quotesNonOrdered) {
            if (q.getQuoteId().equals(quote_id)) {
                return q;
            }
        }
        return null;
    }

    public List<Parcel> getParcelsByStatus(ParcelStatus status) {
        return getMapParcelByStatus().get(status);
    }

    public List<Quote> getOrderByStatus(ParcelStatus status){
        List<Quote> res = new ArrayList<Quote>();
        for (Quote q : orders) {
            if (q.getParcel().getStatus()==status) {
                res.add(q);
            }
        }

        if(res.isEmpty()){
            res=null;
        }

        return res;
    }

    public ParcelStatus getStatusByParcelRef(String parcelRef) {
        Parcel p = this.getParcelByRef(parcelRef);
        if (p == null) {
            return null;
        }
        return p.getStatus();
    }

    // Operation ADD
    public void addCustomer(Customer customer) {
        this.customers.add(customer);
    }

    public void addParcels(Parcel parcel) {
        this.parcels.add(parcel);
        this.addParcelToStatus(parcel);
    }


    public void addQuoteNonOrdered(Quote quote) {
        if (!this.quotesNonOrdered.contains(quote)) {
            this.quotesNonOrdered.add(quote);
        } else {
            this.quotesNonOrdered.remove(quote);
            this.quotesNonOrdered.add(quote);
        }
    }

    public void addQuoteOrdered(Quote quote) {
        this.orders.add(quote);
    }

    public void addParcelToStatus(Parcel p) {
        List<Parcel> parcelList = this.parcelByStatus.get(p.getStatus());
        if (parcelList != null) {
            parcelList.add(p);
        } else {
            parcelList = new ArrayList<Parcel>();
            parcelList.add(p);
        }

        parcelByStatus.put(p.getStatus(), parcelList);
    }

    public DataAccessObject() {
        init();
    }

    // SETTER
    public boolean setParcelStatus(String parcelRef, ParcelStatus newStatus) {
        Parcel p = this.getParcelByRef(parcelRef);
        if (p == null) {
            return false;
        }

        List<Parcel> parcels = this.parcelByStatus.get(p.getStatus());
        parcels.remove(p);

        this.addParcelToStatus(p);

        p.setStatus(newStatus);
        return true;
    }

    public Customer setDiscount(String customerName, int discount) {
        Customer c = this.getCustomerByName(customerName);
        if (c == null) {
            return null;
        }

        c.setTemporaryDiscount(discount);
        return c;
    }

    private void init() {
        this.parcels = new ArrayList<Parcel>();
        this.quotesNonOrdered = new ArrayList<Quote>();
        this.orders = new ArrayList<Quote>();
        this.parcelByStatus = new HashMap<ParcelStatus, List<Parcel>>();
        this.customers = new ArrayList<Customer>();

        this.readCsvFile();
    }

    private void readCsvFile() {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ";";

        InputStream is = DataAccessObject.class
                .getResourceAsStream("data.csv");

        List<RoundStep> steps = new ArrayList<RoundStep>();
        try {
            br = new BufferedReader(new InputStreamReader(is));

            // skip first line
            br.readLine();

            while ((line = br.readLine()) != null) {

                String[] parcelCsv = line.split(cvsSplitBy);

                Address sender = new Address(parcelCsv[2], Integer.valueOf(parcelCsv[3]), parcelCsv[4], "FR");
                Address receiver = new Address(parcelCsv[6], Integer.valueOf(parcelCsv[7]), parcelCsv[8], "FR");
                String pickupDate = parcelCsv[13] + "-" + parcelCsv[14] + ":" + parcelCsv[15];

                this.customers.add(new Customer(parcelCsv[1], 0, sender));
                this.customers.add(new Customer(parcelCsv[5], 7, receiver));

                // new parcel
                Parcel p = new Parcel(Integer.valueOf(parcelCsv[9]), Integer.valueOf(parcelCsv[10]), Integer.valueOf(parcelCsv[11]), Integer.valueOf(parcelCsv[12]), parcelCsv[1], sender, parcelCsv[5], receiver, pickupDate);
                p.setParcelId(parcelCsv[0]);
                p.setStatus(ParcelStatus.valueOf(parcelCsv[16]));
                this.addParcelToStatus(p);
                steps.add(new RoundStep(parcelCsv[0], parcelCsv[1], sender, parcelCsv[5], receiver, pickupDate));
                this.parcels.add(p);

                // new Quote
                String etaDate = parcelCsv[19] + "-" + parcelCsv[20] + ":" + parcelCsv[21];
                Quote q = new Quote(parcelCsv[17], p, Double.valueOf(parcelCsv[18]), etaDate);
                this.orders.add(q);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        this.round = new Round(steps);
    }

}
