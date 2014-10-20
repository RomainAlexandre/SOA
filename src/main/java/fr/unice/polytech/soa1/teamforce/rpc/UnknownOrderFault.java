package fr.unice.polytech.soa1.teamforce.rpc;

import javax.xml.ws.WebFault;

@WebFault(name="Unknown", targetNamespace = "http://informatique.polytech.unice.fr/soa1/teamforce/rpc")
public class UnknownOrderFault extends Exception {
	
	private static final long serialVersionUID = 6647532542732631049L;

	public UnknownOrderFault(String value) {
		super("Error Order : [" + value + "]");
	}

}
