package fr.polytech.unice.soa1.mister.discount.business;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlType(name = "catalog")
public class Catalog {

	private String id;
	private String name;
	private List<Product> products=new ArrayList<Product>();

	public Catalog() {
	}

	public Catalog(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@XmlElement(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@XmlElement(name = "name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElementWrapper(name = "products")
	@XmlElement(name = "product")
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}