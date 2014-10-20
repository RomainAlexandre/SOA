package fr.unice.polytech.soa1.warehouse.business;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement(name = "warehouse")
public class Warehouse {
	private String id;
	private String address;
	private double locationX;
	private double locationY;
	private String zip;
	private String city;
	private List<Box> allBoxes;
	private Employe leader;

	public Warehouse(){
		this("", "", -1, -1, "", "");
	}

	public Warehouse(String id, String address, double locationX, double locationY, String zip, String city){
		this.id = id;
		this.address = address;
		this.locationX = locationX;
		this.locationY = locationY;
		this.zip = zip;
		this.city = city;
		this.allBoxes = new ArrayList<Box>();
	}

	@XmlAttribute(name="id")
	@XmlID
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlAttribute(name="address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@XmlAttribute(name="locationX")
	public double getLocationX() {
		return locationX;
	}

	public void setLocationX(double locationX) {
		this.locationX = locationX;
	}

	@XmlAttribute(name="locationY")
	public double getLocationY() {
		return locationY;
	}

	public void setLocationY(double locationY) {
		this.locationY = locationY;
	}

	@XmlAttribute(name="zip")
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@XmlAttribute(name="city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@XmlElementWrapper(name = "boxes")
	@XmlElement(name = "box")
	public List<Box> getAllBoxes() {
		return allBoxes;
	}

	public void setAllBoxes(List<Box> allBoxes) {
		this.allBoxes = allBoxes;
	}

	@XmlElement(name = "leader")
	public Employe getLeader() {
		return leader;
	}

	public void setLeader(Employe leader) {
		this.leader = leader;
	}
}
