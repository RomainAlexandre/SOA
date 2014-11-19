package fr.polytech.unice.soa1.mister.discount.services;


import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.polytech.unice.soa1.mister.discount.business.ConsultOrderInput;
import fr.polytech.unice.soa1.mister.discount.business.ConsultOrderOutput;
import fr.polytech.unice.soa1.mister.discount.business.CreateOrderInput;
import fr.polytech.unice.soa1.mister.discount.business.CreateOrderOutput;
import fr.polytech.unice.soa1.mister.discount.business.Address;


@WebService(name = "MisterDiscount", targetNamespace = "http://informatique.polytech.unice.fr/soa1/MisterDiscount", portName = "MisterDiscountPort", serviceName = "MisterDiscountService")
public interface IMisterDiscount {

	@WebMethod(operationName = "createOrder")
	@WebResult(name = "receipt")
	public CreateOrderOutput createOrder(CreateOrderInput input);
	
	@WebMethod(operationName = "consultingOrder")
	@WebResult(name = "order")
	public ConsultOrderOutput consultingOrder(ConsultOrderInput input);
	
	@WebMethod(operationName = "registerCatalog")
	@WebResult(name = "succeed")
	public boolean registerCatalog(Address input);
	
	@WebMethod(operationName = "startPrinting")
	@WebResult(name = "succeed")
	public boolean startPrinting();
	
	@WebMethod(operationName = "startDeliveryCatalog")
	@WebResult(name = "succeed")
	public boolean startDeliveryCatalog(String catalogProductId);
}
