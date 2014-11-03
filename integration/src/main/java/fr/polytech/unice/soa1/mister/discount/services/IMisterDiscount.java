package fr.polytech.unice.soa1.mister.discount.services;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.polytech.unice.soa1.mister.discount.business.CreateOrderInput;
import fr.polytech.unice.soa1.mister.discount.business.CreateOrderOutput;


@WebService(name = "MisterDiscount", targetNamespace = "http://informatique.polytech.unice.fr/soa1/MisterDiscount", portName = "MisterDiscountPort", serviceName = "MisterDiscountService")
public interface IMisterDiscount {

	@WebMethod(operationName = "createOrder")
	@WebResult(name = "order")
	public CreateOrderOutput createOrder(CreateOrderInput input);
	
}
