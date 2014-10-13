package fr.unice.polytech.soa1.alexandr.webservice;

import javax.xml.ws.WebFault;

@WebFault(name="UnknownParcel", targetNamespace = "http://informatique.polytech.unice.fr/soa1/romain/fedps/driver")
public class UnknownParcelFault extends Exception{
    private static final long serialVersionUID = 6647532542732631049L;

    public UnknownParcelFault(String value) {
        super("Unknown Parcel: [" + value + "]");
    }
}

