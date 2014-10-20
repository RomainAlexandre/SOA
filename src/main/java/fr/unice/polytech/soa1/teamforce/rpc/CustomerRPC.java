package fr.unice.polytech.soa1.teamforce.rpc;

import java.util.List;

import fr.unice.polytech.soa1.teamforce.business.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/teamforce/rpc/Customer")
public interface CustomerRPC {
	
	@WebMethod(operationName = "create_account")
	@WebResult(name = "account")
	public Custumer create_account(@WebParam(name="firstname")String firstname, @WebParam(name="lastname")String lastname,
			@WebParam(name="email")String email, @WebParam(name="phone")String phone,
			@WebParam(name="line1_addresse_facturation") String line1_f, 
			@WebParam(name="line2_addresse_facturation") String line2_f,
			@WebParam(name="zip_addresse_facturation") String zip_f, 
			@WebParam(name="city_addresse_facturation") String city_f,
			@WebParam(name="kind_addresse_facturation") String kind_f,
			@WebParam(name="line1_addresse_livraison") String line1_l, 
			@WebParam(name="line2_addresse_livraisonn") String line2_l,
			@WebParam(name="zip_addresse_livraison") String zip_l, 
			@WebParam(name="city_addresse_livraison") String city_l,
			@WebParam(name="kind_addresse_livraison") String kind_l);
	
	@WebMethod(operationName = "assign_addresses_to_customer")
	@WebResult(name = "addresses_customer")
	public Custumer Assign_addresses_to_customer(@WebParam(name="line1_addresse_facturation") String line1_f, 
			@WebParam(name="line2_addresse_facturation") String line2_f,
			@WebParam(name="zip_addresse_facturation") String zip_f, 
			@WebParam(name="city_addresse_facturation") String city_f,
			@WebParam(name="kind_addresse_facturation") String kind_f,
			@WebParam(name="line1_addresse_livraison") String line1_l, 
			@WebParam(name="line2_addresse_livraisonn") String line2_l,
			@WebParam(name="zip_addresse_livraison") String zip_l, 
			@WebParam(name="city_addresse_livraison") String city_l,
			@WebParam(name="kind_addresse_livraison") String kind_l,
			@WebParam(name="custumer")  String custumerId) throws UnknownCustomerFault;
	
	@WebMethod(operationName = "create_order")
	@WebResult(name = "orders")
	public Order create_order(@WebParam(name="amount") String amount, 
			@WebParam(name="products") List<String> products, @WebParam(name="custumer")  String custumerId) throws UnknownCustomerFault;



}
