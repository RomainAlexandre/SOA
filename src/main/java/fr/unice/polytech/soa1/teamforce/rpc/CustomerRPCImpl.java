package fr.unice.polytech.soa1.TeamForce.rpc;

import fr.unice.polytech.soa1.TeamForce.business.*;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;


@Stateless(name = "TeamForce-Customer-RPC")
@WebService(targetNamespace = "http://informatique.polytech.unice.fr/soa1/TeamForce/rpc/Customer",
        portName = "TeamForceRPCCustomerPort",
        serviceName = "TeamForceRPCCustomerService",
        endpointInterface = "fr.unice.polytech.soa1.TeamForce.rpc.CustomerRPC")
public class CustomerRPCImpl implements CustomerRPC {

    //Customers can create and manage orders through the CRM, and receive
    //recommendation for their orders.

    @EJB
    private DataAccessObjectCstmr dao;

    @Override
    public Order create_order(String amount,
                              List<String> products, String custumer) throws UnknownCustomerFault {
        List<Product> productObjs = new ArrayList<Product>();
        Double amount2d = 0.0;
        for (String id : products) {
            Product product = dao.getProductByID(id);
            if(product != null){
                amount2d += Double.valueOf(product.getPrice());
                productObjs.add(product);
            }
        }

        Custumer cstmr = dao.findCustumerById(custumer);
        if (cstmr == null) {
            throw new UnknownCustomerFault(custumer);
        }

        Order ordre = new Order(UUID.randomUUID().toString(), amount2d.toString(),
                productObjs, cstmr);
        dao.getordrs().add(ordre);

        cstmr.getOrders().add(ordre);

        return ordre;
    }

    @Override
    public Custumer create_account(String firstname, String lastname, String email, String phone,
                                   String line1_f, String line2_f, String zip_f, String city_f, String kind_f,
                                   String line1_l, String line2_l, String zip_l, String city_l, String kind_l) {

        Custumer custumer = new Custumer(UUID.randomUUID().toString(), firstname, lastname, email, phone);


        List<Addresse> addresses = new ArrayList<>(Arrays.asList(
                new Addresse(line1_f, line2_f, zip_f, city_f, kind_f, custumer),
                new Addresse(line1_l, line2_l, zip_l, city_l, kind_l, custumer)));

        custumer.getAddresses().add(addresses.get(0));
        custumer.getAddresses().add(addresses.get(1));

        dao.getContents().add(custumer);

        return custumer;
    }

    @Override
    public Custumer Assign_addresses_to_customer(String line1_f, String line2_f, String zip_f, String city_f, String kind_f,
                                                 String line1_l, String line2_l, String zip_l, String city_l, String kind_l, String id) throws UnknownCustomerFault {

        Custumer cstmr = dao.getCustomerByID(id);
        if (cstmr == null) {
            throw new UnknownCustomerFault(id);
        }

        List<Addresse> addresses = new ArrayList<>(Arrays.asList(
                new Addresse(line1_f, line2_f, zip_f, city_f, kind_f, cstmr),
                new Addresse(line1_l, line2_l, zip_l, city_l, kind_l, cstmr)));

        cstmr.getAddresses().add(addresses.get(0));
        cstmr.getAddresses().add(addresses.get(1));
        return cstmr;

    }

}
