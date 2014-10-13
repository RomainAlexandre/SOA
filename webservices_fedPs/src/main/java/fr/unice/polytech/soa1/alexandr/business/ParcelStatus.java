package fr.unice.polytech.soa1.alexandr.business;


import javax.xml.bind.annotation.XmlEnum;

@XmlEnum(String.class)
public enum ParcelStatus {
    ARRIVAL_SCAN, DELIVERED, STORAGE, CUSTOMS, IN_TRANSIT;
}
