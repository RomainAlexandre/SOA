package fr.unice.polytech.soa1.jcolinet.rpc;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.unice.polytech.soa1.jcolinet.business.Event;


@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/rpc/leader")
public interface LeaderServices {
	@WebMethod(operationName = "checkNewEvent")
	@WebResult(name = "checkEvent")
	public List<Event> checkNewEvent();
	
	@WebMethod(operationName = "assignEvent")
	@WebResult(name = "assignEvent")
	public boolean assignEvent(@WebParam(name="event")String idEvent, @WebParam(name="employee")String idEmployee);
}
