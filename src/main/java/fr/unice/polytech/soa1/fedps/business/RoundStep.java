package fr.unice.polytech.soa1.fedps.business;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class RoundStep {
    private String parcelId;
    private String sender_name;
    private Address sender;
    private String receiver_name;
    private Address receiver;
    private String pickupDate;

    public RoundStep() {
    }

    public RoundStep(String parcelId, String sender_name, Address sender, String receiver_name, Address receiver, String pickupDate) {
        this.parcelId = parcelId;
        this.sender_name = sender_name;
        this.sender = sender;
        this.receiver_name = receiver_name;
        this.receiver = receiver;
        this.pickupDate = pickupDate;
    }

    @XmlElement(name = "parcel_id", required = true)
    public String getParcelId() {
        return parcelId;
    }

    public void setParcelId(String parcelId) {
        this.parcelId = parcelId;
    }

    @XmlElement(name = "sender_name", required = true)
    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    @XmlElement(name = "sender", required = true)
    public Address getSender() {
        return sender;
    }

    public void setSender(Address sender) {
        this.sender = sender;
    }

    @XmlElement(name = "receiver_name", required = true)
    public String getSender_name() {
        return sender_name;
    }

    public void setSender_name(String sender_name) {
        this.sender_name = sender_name;
    }

    @XmlElement(name = "receiver", required = true)
    public Address getReceiver() {
        return receiver;
    }

    public void setReceiver(Address receiver) {
        this.receiver = receiver;
    }

    @XmlElement(name = "pickup_date", required = true)
    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }
}
