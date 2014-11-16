package fr.polytech.unice.soa1.mister.discount.business;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "consultOrderInput")
public class ConsultOrderInput {
	private String name;
	private String orderID;
	
	public ConsultOrderInput() {
	}

	public ConsultOrderInput(String name, String orderID) {
		this.name = name;
		this.orderID = orderID;
	}
	
	@XmlElement(name = "name", required = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "orderID", required = true)
	public String getOrderID() {
		return orderID;
	}

	public void set0rderID(String orderID) {
		this.orderID = orderID;
	}
}
