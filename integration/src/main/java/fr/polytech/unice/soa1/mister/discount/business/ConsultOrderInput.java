package fr.polytech.unice.soa1.mister.discount.business;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "consultOrderInput")
public class ConsultOrderInput {
	private String name;
	private String orderId;
	
	public ConsultOrderInput() {
	}

	public ConsultOrderInput(String name, String orderID) {
		this.name = name;
		this.orderId = orderID;
	}
	
	@XmlElement(name = "name", required = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "orderId", required = true)
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
}
