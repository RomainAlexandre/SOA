package fr.unice.polytech.soa1.TeamForce.rpc;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

import fr.unice.polytech.soa1.TeamForce.business.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Stateless(name = "TeamForce-Manager-RPC")
@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/TeamForce/rpc/Manager",
		portName = "TeamForceRPCManagerPort",
		serviceName = "TeamForceRPCManagerService",
		endpointInterface = "fr.unice.polytech.soa1.TeamForce.rpc.ManagerRPC")

public class ManagerRPCImpl implements ManagerRPC{
	//Managers can create new catalogue, and assign product to categories.
	
	@EJB
	private DataAccessObjectCstmr dao;
	
	@Override
	public Catalogue create_catalogue(String name){
		Catalogue catalogue = new Catalogue(UUID.randomUUID().toString(), name);
		return catalogue;
	}
	
	@Override
	public String create_product(String name, String price) {
		Product product = new Product(UUID.randomUUID().toString(), name, price);
		return product.getId();
	}
	
	@Override
	public String assign_product_to_categorie(List<String> products, Categorie categorie){
		List<Product> productObjs = new ArrayList<Product>();
			for (Product product : productObjs) {
				product.setCategorie(categorie);
			}
		return "OK";
	}
	
	@Override
	public String assign_product_to_catalogue(List<String>  products, Catalogue catalogue){
		List<Product> productObjs = new ArrayList<Product>();
			for (Product product : productObjs) {
				product.setCatalogue(catalogue);
			}
		return "Liste des produits ajouter au nouveau catalogue";
	}
	
	

}
