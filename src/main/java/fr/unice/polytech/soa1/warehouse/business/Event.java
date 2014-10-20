package fr.unice.polytech.soa1.warehouse.business;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement(name = "event")
public class Event {

	public enum KindAction {
		PICKUP("pickup"),
		DELIVERY("delivery"),
		UNKNOWN("unknown");

		private String type;

		private KindAction(String type){
			this.type = type;
		}

		public static KindAction getKindAction(String action) {
			for (KindAction a : KindAction.values()) {
				if (a.type.equals(action)) {
					return a;
				}
			}
			return UNKNOWN;
		}
	};

	private String id;
	private int hour;
	private int min;
	private KindAction action;
	private int quantity;
	private Product toDeliver;
	private boolean done;
	private boolean assigned;
	
	public Event(){
		this("", KindAction.UNKNOWN, -1, -1, -1, null);
	}
	
	public Event(String id, KindAction action, int hour, int min, int quantity, Product toDeliver){
		this.id = id;
		this.hour = hour;
		this.min = min;
		this.action = action;
		this.toDeliver = toDeliver;
		this.quantity = quantity;
		this.done = false;
		this.assigned = false;
	}

	@XmlElement(name="id")
	@XmlID
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@XmlElement(name="hour")
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	@XmlElement(name="min")
	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	@XmlElement(name="action")
	public KindAction getAction() {
		return action;
	}

	public void setAction(KindAction action) {
		this.action = action;
	}

	@XmlIDREF
	@XmlElement(name="content")
	public Product getToDeliver() {
		return toDeliver;
	}

	public void setToDeliver(Product toDeliver) {
		this.toDeliver = toDeliver;
	}

	@XmlElement(name="quantity")
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@XmlElement(name="done")
	public boolean isDone() {
		return done;
	}

	public void setDone(boolean done) {
		this.done = done;
	}
	
	@XmlElement(name="consulted")
	public boolean isConsulted() {
		return assigned;
	}

	public void setConsulted(boolean consulted) {
		this.assigned = consulted;
	}
}
