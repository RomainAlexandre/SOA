package fr.unice.polytech.soa1.fedps.webservice.manager.inputs;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum(String.class)
public enum ManagerJobKind {
    GET_NB_PARCEL, GET_ORDER, ADD_DISCOUNT
}
