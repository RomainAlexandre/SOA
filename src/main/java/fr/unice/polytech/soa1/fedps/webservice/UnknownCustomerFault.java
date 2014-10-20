package fr.unice.polytech.soa1.fedps.webservice;

import javax.xml.ws.WebFault;

@WebFault(name="UnknownCustomer", targetNamespace = "http://informatique.polytech.unice.fr/soa1/romain/fedps/customer")
public class UnknownCustomerFault extends Exception{
    private static final long serialVersionUID = 6647532542732631049L;

    public UnknownCustomerFault(String value) {
        super("Unknown customer: [" + value + "]");
    }
}

