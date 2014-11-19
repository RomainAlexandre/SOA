package fr.polytech.unice.soa1.mister.discount.exception;

import javax.xml.soap.SOAPException;

public class OperationNotFoundException extends SOAPException {
	private static final long serialVersionUID = 1218523275755896234L;

	public OperationNotFoundException(String operationName){
		super("Operation " + operationName + " not found");
	}
}
