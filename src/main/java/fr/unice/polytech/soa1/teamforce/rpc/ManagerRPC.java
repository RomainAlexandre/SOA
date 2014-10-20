package fr.unice.polytech.soa1.teamforce.rpc;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.unice.polytech.soa1.teamforce.business.*;

@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/teamforce/rpc/Manager")
public interface ManagerRPC {
	
	@WebMethod(operationName = "create_product")
	@WebResult(name = "product")
	public String create_product(@WebParam(name="name")String name, @WebParam(name="price")String price);
	
	@WebMethod(operationName = "create_catalogue")
	@WebResult(name = "catalogue")
	public Catalogue create_catalogue(@WebParam(name="name")String name);
	
	@WebMethod(operationName = "assign_product_to_categorie")
	@WebResult(name = "product_to_categorie")
	public String assign_product_to_categorie(@WebParam(name="products") List<String> products,
			@WebParam(name="categorie") Categorie categorie);
	

	@WebMethod(operationName = "assign_product_to_catalogue")
	@WebResult(name = "product_to_catalogue")
	public String assign_product_to_catalogue(@WebParam(name="products") List<String> products,
			@WebParam(name="catalogue") Catalogue catalogue);


}
