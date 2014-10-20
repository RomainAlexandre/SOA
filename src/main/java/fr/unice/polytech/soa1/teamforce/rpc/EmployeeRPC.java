package fr.unice.polytech.soa1.teamforce.rpc;

import fr.unice.polytech.soa1.teamforce.business.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/teamforce/rpc/Employee")
public interface EmployeeRPC {

	@WebMethod(operationName = "get_addresses_for_custumer") 
	@WebResult(name = "custumers")
	public List<Addresse> getAllAddressesForCustumer(@WebParam(name="id") String id)
		throws UnknownCustomerFault; 
	
	
	@WebMethod(operationName = "get_all_orders")
	@WebResult(name = "orders")
	public List<Order> getAllOrdersForCustomer(@WebParam(name="id") String id)
		throws UnknownCustomerFault;
	
	@WebMethod(operationName = "get_all_custumer")
	@WebResult(name = "custumers")
	public List<Custumer> getAllCustumer();
	
	@WebMethod(operationName = "modify_statut")
	@WebResult(name = "order")
	public Order modify_statut(@WebParam(name="idOrder") String idOrder, @WebParam(name="statut") Statut statut)
			throws UnknownOrderFault;
	
	@WebMethod(operationName = "modify_steps")
	@WebResult(name = "order")
	public Order modify_step(@WebParam(name="idOrder") String idOrder, @WebParam(name="steps") Steps steps)
			throws UnknownOrderFault;
	
	@WebMethod(operationName = "get_customer_by_phone")
	@WebResult(name = "custumers")
	public Custumer findCustomerbyphone(@WebParam(name="phone") String phone)
			throws UnknownCustomerFault;

}


