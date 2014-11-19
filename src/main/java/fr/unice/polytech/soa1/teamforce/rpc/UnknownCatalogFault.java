package fr.unice.polytech.soa1.TeamForce.rpc;

import javax.xml.ws.WebFault;

@WebFault(name="Unknown", targetNamespace = "http://informatique.polytech.unice.fr/soa1/TeamForce/rpc")
public class UnknownCatalogFault extends Exception {

	private static final long serialVersionUID = 6647532542732631049L;

	public UnknownCatalogFault(String value) {
		super("Error catalog : [" + value + "]");
	}

}
