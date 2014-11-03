package fr.polytech.unice.soa1.mister.discount.business;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "createOrderOutput")
public class CreateOrderOutput {
	private String customer;
	private String amount;
	private String orderId;

	public CreateOrderOutput() {
	}

	public CreateOrderOutput(String customer, String amount, String orderId) {
		this.customer =customer;
		this.amount =amount;
		this.orderId = orderId;
	}

	@XmlElement(name = "customerName", required = true)
	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@XmlElement(name = "amount", required = true)
	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@XmlElement(name = "orderId", required = true)
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
}
