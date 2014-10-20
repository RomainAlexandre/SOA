package fr.unice.polytech.soa1.fedps.webservice.manager;

import fr.unice.polytech.soa1.fedps.webservice.UnknownCustomerFault;
import fr.unice.polytech.soa1.fedps.webservice.manager.inputs.BadJobFault;
import fr.unice.polytech.soa1.fedps.webservice.manager.inputs.ManagerInput;
import fr.unice.polytech.soa1.fedps.webservice.manager.outputs.ManagerOutput;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/romain/fedps/manager")
public interface ManagerWs {
    @WebMethod(operationName = "submit")
    @WebResult(name = "result")
    public ManagerOutput dispatch(@WebParam(name = "jobs") ManagerInput input) throws BadJobFault, UnknownCustomerFault;
}
