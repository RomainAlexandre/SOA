package fr.polytech.unice.soa1.mister.discount.business;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "createOrderOutput")
public class CreateOrderOutput {
	private String customer;
	private String amount;
	private String orderId;
	private List<Product> products;

	public CreateOrderOutput() {
		this.products = new ArrayList<Product>();
	}

	public CreateOrderOutput(String customer, String amount, String orderId) {
		this.customer =customer;
		this.amount =amount;
		this.orderId = orderId;
		this.products = new ArrayList<Product>();
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

	@XmlElementWrapper(name = "products")
	@XmlElement(name = "product", required = true)
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
