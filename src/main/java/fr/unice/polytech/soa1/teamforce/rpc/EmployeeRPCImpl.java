package fr.unice.polytech.soa1.teamforce.rpc;

import fr.unice.polytech.soa1.teamforce.business.*;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebParam;
import javax.jws.WebService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Stateless(name = "TeamForce-Employee-RPC")
@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/teamforce/rpc/Employee",
		portName = "TeamForceRPCEmployeePort",
		serviceName = "TeamForceRPCEmployeeService",
		endpointInterface = "fr.unice.polytech.soa1.teamforce.rpc.EmployeeRPC")
public class EmployeeRPCImpl implements EmployeeRPC {
	
	// Employees can consult information about customers (for example to answer
	// questions asked by phone), last phone call.

	@EJB private DataAccessObjectCstmr dao;

	@Override
	public List<Addresse> getAllAddressesForCustumer(String id) throws UnknownCustomerFault {
		Custumer custumer = dao.findCustumerById(id);
		if (custumer == null) {
			throw new UnknownCustomerFault(id);
		}
		return custumer.getAddresses();
	}

	@Override
	public List<Order> getAllOrdersForCustomer(String id) throws UnknownCustomerFault {
		Custumer custumer = dao.findCustumerById(id);
		if (custumer == null) {
			throw new UnknownCustomerFault(id);
		}
		return custumer.getOrders();
	}

	
	@Override
	public List<Custumer> getAllCustumer() {
		return dao.findCustumer();
	}
	
	@Override
	public Custumer findCustomerbyphone(String phone) throws UnknownCustomerFault {
		Custumer custumer = dao.findCustomerbyphone(phone);
		if (custumer == null) {
			throw new UnknownCustomerFault(phone);
		}
		return custumer;
	}

	@Override
	public Order modify_statut(String idOrder, Statut statut) throws UnknownOrderFault {
	    Order order = dao.findOrderById(idOrder);
		if (order == null) {
			throw new UnknownOrderFault(idOrder);
		}
		order.setStatut(statut);
		return order;
	}
	
	@Override
	public Order modify_step(@WebParam(name = "idOrder") String idOrder,
			@WebParam(name = "steps") Steps steps) throws UnknownOrderFault {
	    Order order = dao.findOrderById(idOrder);
		if (order == null) {
			throw new UnknownOrderFault(idOrder);
		}
		order.setSteps(steps);
		return order;
	}
	
	@Override
	public Order add_event_to_order(String text, String order) throws UnknownOrderFault {
		List<Event> events = new ArrayList<>(Arrays.asList(
				new Event(UUID.randomUUID().toString(), text)));
		Order ordr = dao.findOrderById(order);
		if (order == null) {
			throw new UnknownOrderFault(order);
		}
		ordr.getEvent().add(events.get(0));
		return ordr;
		
	}
	
}
