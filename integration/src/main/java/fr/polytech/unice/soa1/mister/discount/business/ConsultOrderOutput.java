package fr.polytech.unice.soa1.mister.discount.business;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "consultOrderOutput")
public class ConsultOrderOutput {
	private String orderId;
	private String trackingNumber;
    private String cost;
    private String eta;
	private List<Product> products;
	private String shippingStatus;

	public ConsultOrderOutput() {
		this.products = new ArrayList<Product>();
	}

	public ConsultOrderOutput(String orderId, String cost, String eta, String shippingStatus, String trackingNumber) {
		this.orderId =orderId;
		this.cost =cost;
		this.eta = eta;
		this.products = new ArrayList<Product>();
		this.shippingStatus = shippingStatus;
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

	@XmlElement(name = "trackingNumber", required = true)
	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	@XmlElement(name = "shippingStatus", required = true)
	public String getShippingStatus() {
		return shippingStatus;
	}

	public void setShippingStatus(String shippingStatus) {
		this.shippingStatus = shippingStatus;
	}
}
