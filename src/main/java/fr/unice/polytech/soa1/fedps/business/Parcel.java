package fr.unice.polytech.soa1.fedps.business;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement(name = "parcel")
public class Parcel {
    private String parcelId;
    private int width;
    private int height;
    private int depth;
    private int weight;
    private String sender_name;
    private Address sender;
    private String receiver_name;
    private Address receiver;
    private String pickupDate;
    private ParcelStatus status;

    public Parcel() {
    }

    public Parcel(int width, int height, int depth, int weight, String sender_name, Address sender, String receiver_name, Address receiver, String pickupDate) {
        this.parcelId = null;
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.weight = weight;
        this.sender_name = sender_name;
        this.sender = sender;
        this.receiver_name = receiver_name;
        this.receiver = receiver;
        this.pickupDate = pickupDate;
    }

    public Parcel(Parcel that) { // Copy Constructor
        this(that.width, that.height, that.depth, that.weight, that.sender_name, that.sender, that.receiver_name, that.receiver, that.pickupDate);
    }

    @Override
    public String toString() {
        return String.format("%d x %d x %d - %d kg. From %s to %s. Pickup : %s", getWidth(), getHeight(), getDepth(), getWeight(), getSender().toString(), getReceiver().toString(), getPickupDate());
    }

    @XmlElement(name = "parcel_id")
    public String getParcelId() {
        return parcelId;
    }

    public void setParcelId(String parcelId) {
        this.parcelId = parcelId;
    }

    @XmlElement(name = "width", required = true)
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @XmlElement(name = "height", required = true)
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @XmlElement(name = "depth", required = true)
    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    @XmlElement(name = "weight", required = true)
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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

    @XmlElement(name = "parcel_status", required = true)
    public ParcelStatus getStatus() {
        return status;
    }

    public void setStatus(ParcelStatus status) {
        this.status = status;
    }
}
