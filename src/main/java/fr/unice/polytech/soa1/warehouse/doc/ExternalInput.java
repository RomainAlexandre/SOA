package fr.unice.polytech.soa1.warehouse.doc;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import fr.unice.polytech.soa1.warehouse.business.Product;

@XmlType
public class ExternalInput {
	
	private int hour;
	private int min;
	private int quantity;
	private KindofTransaction type;
	private Product product;
	
	public ExternalInput() {}


	@XmlElement(name="hour", required = true)
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}

	@XmlElement(name="min", required = true)
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}

	@XmlElement(name="quantity", required = true)
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@XmlElement(name="type", required = true)
	public KindofTransaction getType() {
		return type;
	}
	public void setType(KindofTransaction type) {
		this.type = type;
	}

	@XmlElement(name="content", required = true)
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
}
