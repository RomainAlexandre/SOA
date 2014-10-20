package fr.unice.polytech.soa1.warehouse.rpc;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.unice.polytech.soa1.warehouse.business.Box;
import fr.unice.polytech.soa1.warehouse.business.Coordinate;
import fr.unice.polytech.soa1.warehouse.business.Event;


@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/rpc/employe")
public interface EmployeeServices {

	@WebMethod(operationName = "getBoxByproduct")
	@WebResult(name = "box_product")
	public Box lookForBox(@WebParam(name="idProduct")String idProduct, @WebParam(name="idWarehouse")String idWarehouse);
	@WebMethod(operationName = "getBoxByCoor")
	@WebResult(name = "box_coor")
	public Box lookForBox(@WebParam(name="coor")Coordinate coor, @WebParam(name="idWarehouse")String idWarehouse);


	@WebMethod(operationName = "boxOccupacy")
	@WebResult(name = "boxOccupacy")
	public int boxOccupacy(@WebParam(name="coor")Coordinate coor);

	@WebMethod(operationName = "checkNewEvent")
	@WebResult(name = "checkNewEvent")
	public List<Event> checkNewEvent(@WebParam(name="idEmploye")String idEmployee);

	@WebMethod(operationName = "doOrder")
	@WebResult(name = "doOrder")
	public boolean doOrder(@WebParam(name="idEvent")String idEvent, @WebParam(name="idEmploye")String idEmployee);
	
}
