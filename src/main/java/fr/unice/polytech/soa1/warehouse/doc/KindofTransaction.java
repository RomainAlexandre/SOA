package fr.unice.polytech.soa1.warehouse.doc;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum(String.class)
public enum KindofTransaction {
	PICK, DELIVERY;
}
