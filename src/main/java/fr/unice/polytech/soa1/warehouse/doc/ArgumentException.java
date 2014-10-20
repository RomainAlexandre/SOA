package fr.unice.polytech.soa1.warehouse.doc;

import javax.xml.ws.WebFault;

@WebFault(name="UnknownOperation", targetNamespace = "http://informatique.polytech.unice.fr/soa1/warehouse/doc")
public class ArgumentException extends Exception {
	
	private static final long serialVersionUID = 6647532542732631047L;

	public ArgumentException() {
	}
}
