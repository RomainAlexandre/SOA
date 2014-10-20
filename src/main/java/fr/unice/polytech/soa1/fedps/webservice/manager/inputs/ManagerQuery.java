package fr.unice.polytech.soa1.fedps.webservice.manager.inputs;

import fr.unice.polytech.soa1.fedps.business.ParcelStatus;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "manager_query")
public class ManagerQuery {
    public ManagerQuery() {}

    private ManagerJobKind job;
    private ParcelStatus parcelStatus;
    private String customerName;
    private Integer discount;

    @XmlAttribute(name = "kind", required = true)
    public ManagerJobKind getJob() { return job; }
    public void setJob(ManagerJobKind job) { this.job = job; }

    @XmlElement(name="parcel_status", nillable = true)
    public ParcelStatus getParcelStatus() { return parcelStatus; }
    public void setParcelStatus(ParcelStatus parcel_status) { this.parcelStatus = parcel_status; }

    @XmlElement(name = "customer_name", nillable = true)
    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    @XmlElement(name = "discount", nillable = true)
    public Integer getDiscount() { return discount; }
    public void setDiscount(Integer discount) { this.discount = discount; }
}
