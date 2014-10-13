package fr.unice.polytech.soa1.alexandr.webservice.manager.outputs;

import fr.unice.polytech.soa1.alexandr.business.Customer;
import fr.unice.polytech.soa1.alexandr.business.Parcel;
import fr.unice.polytech.soa1.alexandr.business.Quote;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import java.util.List;

@XmlType(name = "list_of_order")
public class ListOfOrder extends JobResult  {
    private List<Quote> data;

    public ListOfOrder() {}

    @XmlElementWrapper(name="data")
    @XmlElement(name="order")
    public List<Quote> getData() { return data; }
    public void setData(List<Quote> data) { this.data = data; }

}