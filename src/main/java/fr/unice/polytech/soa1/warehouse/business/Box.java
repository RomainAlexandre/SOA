package fr.unice.polytech.soa1.warehouse.business;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class Box {
	private int quantity;
	private Product content;
	private Coordinate place;
	
	public Box(){
		this(0, new Product(), new Coordinate());
	}
	
	public Box(int quantity, Product content, Coordinate place){
		this.quantity = quantity;
		this.content = content;
		this.place = place;
	}
	
	public Box(Box that){
		this.quantity = that.quantity;
		this.content = new Product(that.content);
		this.place = new Coordinate(that.place);
	}

	public int changeNumberProduct(int n){
		quantity += n;
		if(quantity < 0){
			quantity -= n;
			return -1;
		}
		return quantity;
	}
	
	@XmlElement(name="quantity")
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@XmlIDREF
	@XmlElement(name="content")
	public Product getContent() {
		return content;
	}

	public void setContent(Product content) {
		this.content = content;
	}

	@XmlElement(name="place")
	public Coordinate getPlace() {
		return place;
	}

	public void setPlace(Coordinate place) {
		this.place = place;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		return true;
	}
}
