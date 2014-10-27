package fr.polytech.unice.soa1.mister.discount.business;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement(name = "quote")
public class Order {
    private String quoteId;
    private double cost;
    private String eta;

    public Order() {
    }

    public Order(String quoteId, double cost, String eta) {
        this.quoteId = quoteId;
        this.cost = cost;
        this.eta = eta;
    }

    public Order(Order that) {
        this(that.quoteId, that.cost, that.eta);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Order){
            Order q = (Order) obj;
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
