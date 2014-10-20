package fr.unice.polytech.soa1.teamforce.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

public class Order {
	
	private String orderid;
	/*
	 * TO DO
	private List<Product> products;
	*/
	private String amount;
	private Statut statut;
	private Steps steps;
	private List<Product> products = new ArrayList<>();
	private List<Event> events = new ArrayList<>();
	private Custumer custumer;
	private Date date_commande;
	
	public Order() {}

	public Order(String orderid, String amount,Custumer custumer) {
		this.orderid = orderid;
		this.amount = amount;
		this.custumer = custumer;
		this.statut = Statut.Approved;
		this.steps = Steps.Ordered;
		 products = new ArrayList<>();
		 date_commande = new Date();
	}
	public Order(String orderid, String amount, List<Product> products, Custumer custumer) {
		this.orderid = orderid;
		this.amount = amount;
		this.custumer = custumer;
		this.statut = Statut.Processing;
		this.steps = Steps.Prepared;
		this.products=products;
		date_commande = new Date();
	}
	
	@XmlElement(name="order_statut")
	public Statut getStatut() {
		return statut;
	}
	public void setStatut(Statut statut) {
		this.statut = statut;
	}
	
	
	@XmlElement(name="order_steps")
	public Steps getSteps() {
		return steps;
	}
	public void setSteps(Steps steps) {
		this.steps = steps;
	}
	
	@XmlAttribute(name="orderid")
	@XmlID
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	
	@XmlAttribute(name="amount")
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
	@XmlElementWrapper(name = "prducts")
	@XmlElement(name = "product")
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	@XmlElementWrapper(name = "events")
	@XmlElement(name = "events")
	public List<Event> getEvent() {
		return events;
	}
	public void setEvent(List<Event> events) {
		this.events = events;
	}
	
	@XmlElement(name = "date_commande")
	public Date getDate_commande() {
		return date_commande;
	}
	
	@XmlIDREF
	@XmlElement(name = "custumer")
	public Custumer getCustumer() {
		return custumer;
	}
	public void setPCustumer(Custumer custumer) {
		this.custumer = custumer;
	}

	
}
