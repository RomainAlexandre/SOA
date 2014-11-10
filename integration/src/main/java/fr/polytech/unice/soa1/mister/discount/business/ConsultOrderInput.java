package fr.polytech.unice.soa1.mister.discount.business;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "consultOrderInput")
public class ConsultOrderInput {
	private String customerID;
	private String orderRef;

	public ConsultOrderInput() {
	}

	public ConsultOrderInput(String name, String orderRef) {
		this.customerID = name;
		this.orderRef = orderRef;
	}

	@XmlElement(name = "name", required = true)
	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String name) {
		this.customerID = name;
	}

	@XmlElement(name = "orderRef", required = true)
	public String getOrderRefd() {
		return orderRef;
	}

	public void setOrderRef(String orderRef) {
		this.orderRef = orderRef;
	}

}
