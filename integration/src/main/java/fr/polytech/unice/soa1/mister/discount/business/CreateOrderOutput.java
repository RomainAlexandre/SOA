package fr.polytech.unice.soa1.mister.discount.business;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "createOrderOutput")
public class CreateOrderOutput {
	private String orderId;
    private String cost;
    private String eta;
	private List<Product> products;
	private String paymentStatus;

	public CreateOrderOutput() {
		this.products = new ArrayList<Product>();
	}

	public CreateOrderOutput(String orderId, String cost, String eta, String paymentStatus) {
		this.orderId =orderId;
		this.cost =cost;
		this.eta = eta;
		this.products = new ArrayList<Product>();
		this.paymentStatus = paymentStatus;
	}

	@XmlElement(name = "orderId", required = true)
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@XmlElement(name = "cost", required = true)
	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@XmlElement(name = "eta", required = true)
	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}	
	
	@XmlElementWrapper(name = "products")
	@XmlElement(name = "product", required = true)
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	@XmlElement(name = "paymentStatus", required = true)
	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
}
