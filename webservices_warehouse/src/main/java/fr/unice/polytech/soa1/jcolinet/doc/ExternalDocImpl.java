package fr.unice.polytech.soa1.jcolinet.doc;

import java.util.UUID;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import fr.unice.polytech.soa1.jcolinet.business.DataAccessObject;
import fr.unice.polytech.soa1.jcolinet.business.Event;
import fr.unice.polytech.soa1.jcolinet.business.Event.KindAction;

@Stateless(name = "WarehouseExternalDOC")
@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/warehouse",
			portName = "WarehouseExternalPort",
			serviceName = "WarehouseExternalService",
			endpointInterface = "fr.unice.polytech.soa1.jcolinet.doc.ExternalDoc")
public class ExternalDocImpl implements ExternalDoc {

	@EJB private DataAccessObject dao;
	
	@Override
	public ExternalOutput dispatch(ExternalInput input)
			throws ArgumentException {

		check(input);

		ExternalOutput res = new ExternalOutput();
		String id = "_"+UUID.randomUUID().toString();
		Event e;

		switch(input.getType()) {
		case PICK:
			e = new Event(id, KindAction.PICKUP, input.getHour(), input.getMin(), input.getQuantity(), input.getProduct());
			break;
		case DELIVERY:
			e = new Event(id, KindAction.DELIVERY, input.getHour(), input.getMin(), input.getQuantity(), input.getProduct());
			break;
		default : 
			throw new ArgumentException();
		}
		
		res.setEvent(e);
		dao.getEvents().add(e);
		return res;
	}

	private void check(ExternalInput input) throws ArgumentException {
		if (input == null){
			throw new ArgumentException();
		}
		if (input.getHour() < 0){
			throw new ArgumentException();
		}
		if (input.getMin() < 0){
			throw new ArgumentException();
		}
		if (input.getQuantity() < 0){
			throw new ArgumentException();
		}
		if (input.getProduct() == null){
			throw new ArgumentException();
		}
		if (input.getType() == null){
			throw new ArgumentException();
		}
	}
}
