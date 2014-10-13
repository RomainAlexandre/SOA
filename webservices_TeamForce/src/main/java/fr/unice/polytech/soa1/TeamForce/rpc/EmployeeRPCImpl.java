package fr.unice.polytech.soa1.TeamForce.rpc;

import fr.unice.polytech.soa1.TeamForce.business.*;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.net.ssl.SSLEngineResult.Status;

import java.util.List;

@Stateless(name = "TeamForce-Employee-RPC")
@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/TeamForce/rpc/Employee",
		portName = "TeamForceRPCEmployeePort",
		serviceName = "TeamForceRPCEmployeeService",
		endpointInterface = "fr.unice.polytech.soa1.TeamForce.rpc.EmployeeRPC")
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
	
}
