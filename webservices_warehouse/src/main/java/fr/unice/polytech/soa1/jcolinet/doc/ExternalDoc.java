package fr.unice.polytech.soa1.jcolinet.doc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;


@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/warehouse")
public interface ExternalDoc {
	@WebMethod(operationName = "execute")
	@WebResult(name = "processed")
	public ExternalOutput dispatch(@WebParam(name = "job") ExternalInput input) throws ArgumentException;

}
