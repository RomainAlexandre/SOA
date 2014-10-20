package fr.unice.polytech.soa1.teamforce.business;

import javax.ejb.Singleton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Singleton(name = "DataForce-DB-Mock")
public class DataAccessObjectCstmr {
	
	private List<Custumer> contents;
	private List<Order> ordrs;
	
	private List<Product> products;
	
	private List<Event> events;
	
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public void setEvents(List<Event> events) {
		this.events = events;
	}
	public List<Event> getEvents() {
		return events;
	}
	
	public List<Custumer> getContents() { return contents; }
	public List<Order> getordrs() { return ordrs; }
	
	public void setContents(List<Custumer> custumers) { this.contents = custumers; }
	public void setordrs(List<Order> orders) { this.ordrs = orders; }

	public DataAccessObjectCstmr() {contents=new ArrayList<>(); init(); }
	
	public Custumer findCustumerById(String id) {
//		return getContents().stream().filter(r -> r.getId().equals(id)).findFirst();
	
		for (Custumer customer : contents) {
			if (customer.getId().equalsIgnoreCase(id)) {
				return customer;
			}
		}
		return null;
	}
	
	public Custumer findCustomerbyphone(String phone) {
	
		for (Custumer customer : contents) {
			if (customer.getPhone().equalsIgnoreCase(phone)) {
				return customer;
			}
		}
		return null;
	}
	
	public List<Custumer> findCustumer() {
		return contents;
	}
	
	public Order findOrderById(String id) {
//		return getContents().stream().filter(r -> r.getId().equals(id)).findFirst();
	
		for (Order order : ordrs) {
			if (order.getOrderid().equalsIgnoreCase(id)) {
				return order;
			}
		}
		return null;
	}
	
	
	
	public String Calcul_amount(List<Product> products) {
		
		String amount = "0";
		for (Product product : products) {
		    amount += product.getPrice();
		}
		return amount;
	}


	/*
	 * Les constructeurs
	 * 
	 * 	public Addresse(String line1, String line2, String zip, String city, String kind, Custumer custumer) {
		this.line1 = line1;
		this.line2 = line2;
		this.zip = zip;
		this.city = city;
		this.kind = kind;
		this.custumer = custumer;
	}
	 * 
	 * 
	 * 	public Custumer(String id, String firstname, String lastname, String email, String phone) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.addresses = new ArrayList<>();
		this.orders = new ArrayList<>();
	}
	 * 
	 * 
	 * 	public Order(String orderid, int quantity, String amount, Product product, Custumer custumer) {
		this.orderid = orderid;
		this.products = new ArrayList<>();
		this.quantity = quantity;
		this.amount = amount;
		this.custumer = custumer;
		this.statut = Statut.Processing;
		this.steps = Steps.Prepared;
	}
	 *
	 *
	 *	public Catalogue(String id, List<Product> products) {
		this.id = id;
		this.products = products;
	}
	 *
	 *
	 *	public Product(String id, String name, Catalogue catalogue, Order order) {
		this.id = id;
		this.name = name;
		this.catalogue = catalogue;
		this.order = order;
		this.categorie = Categorie.Bijoux;
	}
	 *
	 */
	
	public String toString() {
		StringBuilder builder = new StringBuilder("Database: \n");
		for(Custumer r: contents) {
			builder.append(String.format("[%s] %s - %s :\n", r.getId(), r.getFirstname(), r.getAddresses()));
			for(Addresse A: r.getAddresses()) {
				builder.append(A.toString());
				builder.append("\n");
			}
			builder.append("\n");
		}
		return builder.toString();
	}


	private void init() {

		products = new ArrayList<>();
		ordrs = new ArrayList<>();
		events = new ArrayList<>();
		Custumer c1 = new Custumer("C1", "Lucian", "Bolton", "Sed.nunc.est@euturpis.co.uk", "0800 155 4601");
		Custumer c2 = new Custumer("C3", "Cruz", "Byers", "eleifend.non.dapibus@tempor.ca", "(016977) 6083");

		List<Addresse> addresses = new ArrayList<>(Arrays.asList(
				new Addresse("Ap #545-1402 Ullamcorper, St.", "MT", "45793", "Bozeman", "personal", c1),
				new Addresse("P.O. Box 100, 3315 Lacus. St.", "Arkansas", "71290", "Little Rock", "professional", c1)));
		
		List<Addresse> addresses1 = new ArrayList<>(Arrays.asList(
				new Addresse("P.O. Box 433, 5115 Integer Rd.", "WY", "97395", "Casper", "personal", c2),
				new Addresse("7205 Pharetra. St.", "Wisconsin", "27798", "Kenosha", "professional", c2)));
		
		List<Event> events = new ArrayList<>(Arrays.asList(
				new Event("1", "l'ordre attend bonne #O2"),
				new Event("2", "l'ordre attend bonne #O1")));

		c1.getAddresses().add(addresses.get(0));
		c1.getAddresses().add(addresses.get(1));
		
		c2.getAddresses().add(addresses1.get(0));
		c2.getAddresses().add(addresses1.get(1));


		Catalogue cat1 = new Catalogue("1", "Ete 2014");
		Catalogue cat2 = new Catalogue("2", "Printemps 2015");	
		
		Order o1 = new Order("1", 5, "152€", c1);
		Order o2 = new Order("2", 12, "1542€", c2);
		
		o1.getEvent().add(events.get(0));
		o1.getEvent().add(events.get(1));
		
		//Order o3 = new Order("3", 7, "17455€", null, c2);
		
		
		
		List<Product> products1 = new ArrayList<>(Arrays.asList(
				new Product("1", "samsung", "600", cat1),
				new Product("2", "chaine", "100", cat1),
				new Product("3", "swatch", "70", cat1)));
		
		List<Product> products2 = new ArrayList<>(Arrays.asList(
				new Product("4", "une montre", "150", cat1),
				new Product("5", "un tournevis", "20", cat1)));
		
		List<Product> products3 = new ArrayList<>(Arrays.asList(
				new Product("6", "Mauliere 2015", "150"),
				new Product("7", "New Livre 2015", "20")));
		
		products.addAll(products1);
		products.addAll(products2);
		
		//cat1.setProducts(products1);
		//cat2.setProducts(products2);
		
		Product p1 = new Product(); 
		//p1 = cat1.getProducts().get(1);
		o1.getProducts().add(p1);
		c1.getOrders().add(o1); 
		o1.setProducts(products1);
		o2.setProducts(products2);
		
		ordrs.add(o1);
		ordrs.add(o2);
		
		contents.add(c1);
		contents.add(c2);
		
	}
	
	
	public Product getProductByID(String id){
		for (Product product : products) {
			if(product.getId().equals(id)) 
				return product;
		}
		return null;
	}
	
	public Custumer getCustomerByID(String id){
		for (Custumer c: contents) {
			if(c.getId().equals(id)) return c;
		}
		return null;
	}
	
	/*public Product getProduct(){
		for (Product c: products3) {
		
		return null;
		
	}*/


}
