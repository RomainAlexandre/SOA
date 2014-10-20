package fr.unice.polytech.soa1.fedps.business;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement(name = "quote")
public class Quote {
    private String quoteId;
    private Parcel parcel;
    private double cost;
    private String eta;

    public Quote() {
    }

    public Quote(String quoteId, Parcel parcel, double cost, String eta) {
        this.quoteId = quoteId;
        this.parcel = parcel;
        this.cost = cost;
        this.eta = eta;
    }

    public Quote(Quote that) {
        this(that.quoteId, that.parcel, that.cost, that.eta);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Quote){
            Quote q = (Quote) obj;
            return this.getQuoteId().equals(q.getQuoteId());
        }
        return false;
    }

    @XmlElement(name = "quote_id", required = true)
    public String getQuoteId() {
        return quoteId;
    }

    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }

    @XmlElement(name = "parcel")
    public Parcel getParcel() {
        return parcel;
    }

    public void setParcel(Parcel parcel) {
        this.parcel = parcel;
    }

    @XmlElement(name = "cost", required = true)
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @XmlElement(name = "eta", required = true)
    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }
}
