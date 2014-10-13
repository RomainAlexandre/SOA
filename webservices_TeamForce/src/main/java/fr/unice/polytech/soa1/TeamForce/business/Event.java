package fr.unice.polytech.soa1.TeamForce.business;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class Event {
	
	private String id;
	private String text;
	private Order order;
	
	public Event() {}
	
	public Event(String id, String text) {
		this.id = id;
		this.text = text;
	}
	
	@XmlAttribute(name="id")
	@XmlID
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@XmlAttribute(name="text")
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@XmlElement(name="order")
	@XmlIDREF
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}

}
