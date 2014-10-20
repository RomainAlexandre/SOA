package fr.unice.polytech.soa1.TeamForce.business;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlType
@XmlRootElement(name = "Custumer")
public class Custumer {
	
	private String id;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private List<Addresse> addresses;
	private List<Order> orders;
	
	public Custumer() {}

	public Custumer(String id, String firstname, String lastname, String email, String phone) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.addresses = new ArrayList<>();
		this.orders = new ArrayList<>();
	}
	
	/*public Custumer(Custumer that) {  // copy constructor
		this(that.id, that.firstname, that.lastname, that.email, that.phone);
		for(Addresse a: that.addresses) {
			Addresse clone = new Addresse(a);
			clone.setAddresse(this);
			this.getAddresse().add(clone);
		}
	}*/
	
	@XmlAttribute(name="id")
	@XmlID
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	@XmlElement(name="firstname")
	public String getFirstname() {
		return firstname;
	}
	public void setFirstame(String firstname) {
		this.firstname = firstname;
	}
	
	@XmlElement(name="lastname")
	public String getLastname() {
		return lastname;
	}
	public void setLastame(String lastname) {
		this.lastname = lastname;
	}
	
	@XmlElement(name="email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@XmlElement(name="phone")
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@XmlElementWrapper(name = "addresses")
	@XmlElement(name = "addresse")
	public List<Addresse> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Addresse> addresses) {
		this.addresses = addresses;
	}
	
	@XmlElementWrapper(name = "orders")
	@XmlElement(name = "order")
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public boolean equals (Object that) {  // Necessary for object stored in collections ( => find, remove, ...)
		return  (this == that || (that instanceof Custumer && this.id.equals(((Custumer) that).id)));
	}

	@Override
	public int hashCode(){ return this.id.hashCode(); }


//TO DO

}