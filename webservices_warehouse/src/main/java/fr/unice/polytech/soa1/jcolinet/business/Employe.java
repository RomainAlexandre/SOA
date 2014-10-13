package fr.unice.polytech.soa1.jcolinet.business;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlType
@XmlRootElement(name = "employee")
public class Employe{
	private String id;
	private String lastName;
	private String firstName;
	private List<Event> toDoToday;
	private Warehouse workPlace;

	public Employe(){
		this("", "", "");
	}

	public Employe(String id, String lastName, String firstName){
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.toDoToday = new ArrayList<Event>();
	}

	@XmlAttribute(name="id")
	@XmlID
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement(name="lastName")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@XmlElement(name="firstName")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@XmlElementWrapper(name = "events")
	@XmlElement(name = "event")
	public List<Event> getToDoToday() {
		return toDoToday;
	}

	public void setToDoToday(List<Event> toDoToday) {
		this.toDoToday = toDoToday;
	}

	@XmlIDREF
	@XmlElement(name = "warehouse")
	public Warehouse getWorkPlace() {
		return workPlace;
	}

	public void setWorkPlace(Warehouse workPlace) {
		this.workPlace = workPlace;
	}
}
