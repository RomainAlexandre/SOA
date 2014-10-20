package fr.unice.polytech.soa1.fedps.webservice.manager;

import fr.unice.polytech.soa1.fedps.business.Customer;
import fr.unice.polytech.soa1.fedps.business.DataAccessObject;
import fr.unice.polytech.soa1.fedps.webservice.UnknownCustomerFault;
import fr.unice.polytech.soa1.fedps.webservice.manager.inputs.BadJobFault;
import fr.unice.polytech.soa1.fedps.webservice.manager.inputs.ManagerInput;
import fr.unice.polytech.soa1.fedps.webservice.manager.inputs.ManagerQuery;
import fr.unice.polytech.soa1.fedps.webservice.manager.outputs.*;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@Stateless(name = "FedPSManager")
@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/romain/fedps/manager",
        portName = "FedPSManagerPort",
        serviceName = "FedPSManagerService",
        endpointInterface = "fr.unice.polytech.soa1.fedps.webservice.manager.ManagerWs")
public class ManagerWsImpl implements ManagerWs {

    @EJB
    private DataAccessObject dao;

    @Override
    public ManagerOutput dispatch(ManagerInput input) throws BadJobFault, UnknownCustomerFault {
        List<JobResult> results = new ArrayList<>();
        for (ManagerQuery query : input.getJobs()) {
            check(query);
            JobResult result = null;
            switch (query.getJob()) {
                case ADD_DISCOUNT:
                    result = addDiscount(query);
                    break;
                case GET_NB_PARCEL:
                    result = getNbParcelByStatus(query);
                    break;
                case GET_ORDER:
                    result = getOrdersByStatus(query);
                    break;
            }
            results.add(result);
        }
        ManagerOutput out = new ManagerOutput();
        out.setResults(results);
        return out;
    }

    private void check(ManagerQuery query) throws BadJobFault {
        Boolean error = false;
        String errorMessage = "";
        switch (query.getJob()) {
            case ADD_DISCOUNT:
                error = (query.getCustomerName() == null || query.getDiscount() == null);
                errorMessage = "CustomerName, Discount or both are null";
                break;
            case GET_NB_PARCEL:
            case GET_ORDER:
                error = query.getParcelStatus() == null;
                errorMessage = "ParcelStatus is null";
                break;
        }
        if (error)
            throw new BadJobFault(errorMessage);
    }

    private JobResult addDiscount(ManagerQuery query) throws UnknownCustomerFault {
        Customer c = this.dao.setDiscount(query.getCustomerName(), query.getDiscount());
        if (c!=null) {
            CustomerResult res = new CustomerResult();
            res.setData(c);
            return res;
        } else {
            throw new UnknownCustomerFault(query.getCustomerName());
        }
    }

    private JobResult getNbParcelByStatus(ManagerQuery query) {
        NbParcelByStatus res = new NbParcelByStatus();
        res.setNbParcel(dao.getParcelsByStatus(query.getParcelStatus()).size());
        res.setParcelStatus(query.getParcelStatus());
        return res;
    }

    private JobResult getOrdersByStatus(ManagerQuery query) {
        ListOfOrder res = new ListOfOrder();
        res.setData(dao.getOrderByStatus(query.getParcelStatus()));
        return res;
    }
}
