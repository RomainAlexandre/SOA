package fr.unice.polytech.soa1.fedps.webservice.manager.outputs;

import fr.unice.polytech.soa1.fedps.business.Customer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "customer_result")
public class CustomerResult extends JobResult {
    private Customer data;

    public CustomerResult() {
    }

    @XmlElement(name = "customer")
    public Customer getData() {
        return data;
    }

    public void setData(Customer data) {
        this.data = data;
    }
}
