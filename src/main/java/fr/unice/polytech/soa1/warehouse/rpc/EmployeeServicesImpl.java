package fr.unice.polytech.soa1.warehouse.rpc;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import fr.unice.polytech.soa1.warehouse.business.Box;
import fr.unice.polytech.soa1.warehouse.business.Coordinate;
import fr.unice.polytech.soa1.warehouse.business.DataAccessObject;
import fr.unice.polytech.soa1.warehouse.business.Employe;
import fr.unice.polytech.soa1.warehouse.business.Event;
import fr.unice.polytech.soa1.warehouse.business.Event.KindAction;
import fr.unice.polytech.soa1.warehouse.business.Warehouse;

@Stateless(name = "EmployeeRPC")
@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/rpc/employe",
			portName = "WarehouseEmployeePort",
			serviceName = "WarehouseEmployeeService",
			endpointInterface = "fr.unice.polytech.soa1.warehouse.rpc.EmployeeServices")
public class EmployeeServicesImpl implements EmployeeServices {

	@EJB private DataAccessObject dao;
	
	@Override
	public Box lookForBox(String idProduct, String idWarehouse) {
		Warehouse warehouse = dao.getWarehouseById(idWarehouse);
		if(warehouse == null){
			return null;
		}
		for (Box box : warehouse.getAllBoxes()) {
			if(box.getContent().getId().equals(idProduct)){
				return box;
			}
		}
		return null;
	}

	@Override
	public Box lookForBox(Coordinate coor, String idWarehouse) {
		Warehouse warehouse = dao.getWarehouseById(idWarehouse);
		if(warehouse == null){
			return null;
		}
		for (Box box : warehouse.getAllBoxes()) {
			if(box.getPlace().equals(coor)){
				return box;
			}
		}
		return null;
	}

	@Override
	public int boxOccupacy(Coordinate coor) {
		Box b = null;
		for (Box box : dao.getBoxes()) {
			if(box.getPlace().equals(coor)){
				b = box;
			}
		}
		if(b == null){
			return -1;
		}
		return b.getQuantity();
	}

	@Override
	public List<Event> checkNewEvent(String idEmployee) {
		List<Event> res = new ArrayList<Event>();
		Employe employe = dao.getEmployeById(idEmployee);
		if(employe == null){
			return null;
		}
		for (Event event : employe.getToDoToday()) {
			if(!event.isDone()){
				res.add(event);
			}
		}
		return res;
	}

	@Override
	public boolean doOrder(String idEvent, String idEmployee) {
		Employe employe = dao.getEmployeById(idEmployee);
		if(employe == null){
			return false;
		}
		Event ev = null;
		for (Event event : employe.getToDoToday()) {
			if(event.getId().equals(idEvent) && !event.isDone()){
				ev = event;
				break;
			}
		}
		if(ev == null){
			return false;
		}
		
		Box box = lookForBox(ev.getToDeliver().getId(), employe.getWorkPlace().getId());
		if(box == null){
			return false;
		}
		if(box.changeNumberProduct(ev.getAction() == KindAction.PICKUP ? -ev.getQuantity() : ev.getQuantity()) < 0){
			return false;
		}
		ev.setDone(true);
		return true;
	}

}
