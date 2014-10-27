package fr.polytech.unice.soa1.mister.discount.services;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService(name = "MisterDiscount", targetNamespace = "http://informatique.polytech.unice.fr/soa1/MisterDiscount", portName = "MisterDiscountPort", serviceName = "MisterDiscountService")
public interface IMisterDiscount {

	@WebMethod(operationName = "createOrder")
	@WebResult(name = "order")
	public String createOrder(String nom);
	
}
