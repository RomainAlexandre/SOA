package fr.unice.polytech.soa1.alexandr.business;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class Address {
    private String streetName;
    private int zipCode;
    private String cityName;
    private String countryId;

    public Address() {
    }

    public Address(String streetName, int zipCode, String cityName, String countryId) {
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.cityName = cityName;
        this.countryId = countryId;
    }

    public Address(Address that) { // Copy Constructor
        this(that.streetName, that.zipCode, that.cityName, that.countryId);
    }

    @Override
    public String toString() {
        return String.format("%s, %d %s - %s",  getStreetName(), getZipCode(), getCityName(), getCountryId());
    }

    @XmlElement(name = "street_name", required = true)
    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    @XmlElement(name = "zip_code", required = true)
    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    @XmlElement(name = "city_name", required = true)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @XmlElement(name = "country_id", required = true)
    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

}
