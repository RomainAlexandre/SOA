package fr.unice.polytech.soa1.alexandr.webservice.manager;

import fr.unice.polytech.soa1.alexandr.business.Parcel;
import fr.unice.polytech.soa1.alexandr.business.ParcelStatus;
import fr.unice.polytech.soa1.alexandr.webservice.UnknownCustomerFault;
import fr.unice.polytech.soa1.alexandr.webservice.manager.inputs.BadJobFault;
import fr.unice.polytech.soa1.alexandr.webservice.manager.inputs.ManagerInput;
import fr.unice.polytech.soa1.alexandr.webservice.manager.outputs.ManagerOutput;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/romain/fedps/manager")
public interface ManagerWs {
    @WebMethod(operationName = "submit")
    @WebResult(name = "result")
    public ManagerOutput dispatch(@WebParam(name = "jobs") ManagerInput input) throws BadJobFault, UnknownCustomerFault;
}
