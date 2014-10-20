package fr.unice.polytech.soa1.fedps.webservice;

import javax.xml.ws.WebFault;

@WebFault(name="UnknownQuote", targetNamespace = "http://informatique.polytech.unice.fr/soa1/romain/fedps/customer")
public class UnknownQuoteFault  extends Exception{
    private static final long serialVersionUID = 6647532542732631049L;

    public UnknownQuoteFault(String value) {
        super("Unknown Quote: [" + value + "]");
    }
}

