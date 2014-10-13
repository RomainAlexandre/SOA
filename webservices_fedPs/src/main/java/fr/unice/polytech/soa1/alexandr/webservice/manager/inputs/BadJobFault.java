package fr.unice.polytech.soa1.alexandr.webservice.manager.inputs;

import javax.xml.ws.WebFault;

@WebFault(name = "BadJobFault", targetNamespace = "http://informatique.polytech.unice.fr/soa1/romain/fedps/manager")
public class BadJobFault extends Exception {

    private static final long serialVersionUID = 6647532542732631149L;

    public BadJobFault(String value) {
        super("Bad Job: [" + value + "]");
    }
}
