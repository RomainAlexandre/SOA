package fr.unice.polytech.soa1.warehouse.doc;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import fr.unice.polytech.soa1.warehouse.business.Event;

@XmlType
public class ExternalOutput {

	public ExternalOutput(){}
	
	private Event event;


	@XmlElement(name="event_out", required = true)
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
}
