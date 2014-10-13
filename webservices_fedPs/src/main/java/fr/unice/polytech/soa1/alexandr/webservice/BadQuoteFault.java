package fr.unice.polytech.soa1.alexandr.webservice;

import javax.xml.ws.WebFault;

@WebFault(name="BadQuote", targetNamespace = "http://informatique.polytech.unice.fr/soa1/romain/fedps/customer")
public class BadQuoteFault extends Exception{
    private static final long serialVersionUID = 6647532542732631049L;

    public BadQuoteFault(String value) {
        super("Bad Quote : " + value);
    }
}
