package fr.unice.polytech.soa1.TeamForce.business;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class Catalogue {

	private String id;
	private String name;
	//private List<Product> products=new ArrayList<Product>();

	public Catalogue() {
	}

	public Catalogue(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@XmlAttribute(name = "id")
	@XmlID
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@XmlAttribute(name = "name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/*@XmlElementWrapper(name = "products")
	@XmlElement(name = "product")
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}*/

}