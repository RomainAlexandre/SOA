package fr.polytech.unice.soa1.mister.discount.business;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "Order")
public class InternalOrder {
	// OrderIds
	private String orderId;
	private String quoteId;
	
	// Receipt
	private String eta;
	private String amount;
	private List<Product> products;
	private String shippingStatus;
	private String paymentStatus;
	
	// Customer information
	private String customer;
	private String streetName;
	private int zipCode;
	private String cityName;
	private String countryId;
	private String cardNumber;

	
	public InternalOrder() {
		this.products = new ArrayList<Product>();
	}

	public InternalOrder(String customer, String amount, String orderId, String quoteId,
			String streetName, int zipCode, String cityName, String countryId, String cardNumber) {
		this.customer = customer;
		this.amount = amount;
		this.orderId = orderId;
		this.quoteId = quoteId;
		this.products = new ArrayList<Product>();
		this.streetName = streetName;
		this.zipCode = zipCode;
		this.cityName = cityName;
		this.countryId = countryId;
		this.cardNumber = cardNumber;
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

	@XmlElement(name = "quoteId", required = true)
	public String getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	@XmlElement(name = "eta", required = true)
	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}

	@XmlElement(name = "street_name", required = true)
	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@XmlElement(name = "zip_code", required = true)
	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	@XmlElement(name = "city_name", required = true)
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@XmlElement(name = "country_id", required = true)
	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	
	@XmlElement(name = "cardNumber", required = true)
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	@XmlElement(name = "paymentStatus", required = true)
	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	@XmlElement(name = "shippingStatus", required = true)
	public String getShippingStatus() {
		return shippingStatus;
	}

	public void setShippingStatus(String shippingStatus) {
		this.shippingStatus = shippingStatus;
	}
}
