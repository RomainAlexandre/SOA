package fr.polytech.unice.soa1.mister.discount.business;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "createOrderInput")
public class CreateOrderInput {
	private String name;
	private List<String> productsId;

	public CreateOrderInput() {
	}

	public CreateOrderInput(String name, List<String> productsId) {
		this.name = name;
		this.productsId = productsId;
	}

	@XmlElement(name = "name", required = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "productsId", required = true)
	public List<String> getProductsId() {
		return productsId;
	}

	public void setProductsId(List<String> productsId) {
		this.productsId = productsId;
	}

}
