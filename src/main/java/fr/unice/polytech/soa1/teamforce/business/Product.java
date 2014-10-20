package fr.unice.polytech.soa1.teamforce.business;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class Product {

	private String id;
	private String name;
	private String price;
	private Categorie categorie;
	private Catalogue catalogue;
	private Order order;
	
	public Product() {}
	
	public Product(String id, String name, String price, Catalogue catalogue) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.catalogue = catalogue;
		this.categorie = Categorie.Bijoux;
	}
	
	public Product(String id, String name, String price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Product(Product that) { // Copy Constructor
		this(that.id, that.name, that.price, that.catalogue);
		this.categorie = that.categorie;
	}

	@Override
	public String toString() {
		return String.format("  [%s] %s %s ", getId(), getName(), getCategorie());
	}
	
	@XmlAttribute(name="id")
	@XmlID
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@XmlAttribute(name="name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name="categorie")
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	@XmlElement(name="catalogue")
	@XmlIDREF
	public Catalogue getCatalogue() {
		return catalogue;
	}
	public void setCatalogue(Catalogue catalogue) {
		this.catalogue = catalogue;
	}
	
	@XmlElement(name="order")
	@XmlIDREF
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	@XmlElement(name="Price")
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
}