package fr.unice.polytech.soa1.TeamForce.business;


import javax.xml.bind.annotation.*;

@XmlType
@XmlRootElement(name = "Addresse")
public class Addresse {
	
	private String line1;
	private String line2;
	private String zip;
	private String city;
	private String kind;
	private Custumer custumer;
	
	public Addresse() {}
	
	public Addresse(String line1, String line2, String zip, String city, String kind, Custumer custumer) {
		this.line1 = line1;
		this.line2 = line2;
		this.zip = zip;
		this.city = city;
		this.kind = kind;
		this.custumer = custumer;
	}
	
	@XmlElement(name="line1")
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	
	@XmlElement(name="line2")
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	
	@XmlElement(name="zip")
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	@XmlElement(name="city")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@XmlElement(name="kind")
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@XmlElement(name="Custumer")
	@XmlIDREF
	public Custumer getCustumer() {
		return custumer;
	}
	public void setOwner(Custumer custumer) {
		this.custumer = custumer;
	}

}
