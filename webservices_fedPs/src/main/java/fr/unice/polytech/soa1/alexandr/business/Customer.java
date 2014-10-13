package fr.unice.polytech.soa1.alexandr.business;

import javax.xml.bind.annotation.XmlElement;

public class Customer {
    private String name;
    private int permanentDiscount;
    private int temporaryDiscount;
    private Address address;

    public Customer(){}

    public Customer(String name, int permanentDiscount, Address address){
        this.name = name;
        this.permanentDiscount = permanentDiscount;
        this.temporaryDiscount = 0;
        this.address = address;
    }

    @XmlElement(name = "name", required = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "permanent_discount")
    public int getPermanentDiscount() {
        return this.permanentDiscount;
    }

    public void setPermanentDiscount(int permanentDiscount) {
        this.permanentDiscount = permanentDiscount;
    }


    @XmlElement(name = "temporary_discount")
    public int getTemporaryDiscount() {
        int res = temporaryDiscount;
        temporaryDiscount = 0;
        return res;
    }

    public void setTemporaryDiscount(int temporaryDiscount) {
        this.temporaryDiscount = temporaryDiscount;
    }

    @XmlElement(name = "customer_address")
    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
