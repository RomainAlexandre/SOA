package fr.unice.polytech.soa1.jcolinet.rpc;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import fr.unice.polytech.soa1.jcolinet.business.DataAccessObject;
import fr.unice.polytech.soa1.jcolinet.business.Employe;
import fr.unice.polytech.soa1.jcolinet.business.Event;

@Stateless(name = "LeaderRPC")
@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/rpc/leader",
			portName = "WarehouseLeaderPort",
			serviceName = "WarehouseLeaderService",
			endpointInterface = "fr.unice.polytech.soa1.jcolinet.rpc.LeaderServices")
public class LeaderServicesImpl implements LeaderServices {

	@EJB private DataAccessObject dao;
	
	@Override
	public List<Event> checkNewEvent() {
		List<Event> res = new ArrayList<Event>();
		for (Event event : dao.getEvents()) {
			if(!event.isConsulted()){
				res.add(event);
			}
		}
		return res;
	}

	@Override
	public boolean assignEvent(String idEvent, String idEmployee) {
		Event event = null;
		Employe employe = dao.getEmployeById(idEmployee);
		for (Event ev : dao.getEvents()) {
			if(ev.getId().equals(idEvent)){
				event = ev;
				break;
			}
		}
		
		if(event == null || employe == null){
			return false;
		}
		
		event.setConsulted(true);
		employe.getToDoToday().add(event);
		return true;
	}

}
