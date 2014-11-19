package fr.polytech.unice.soa1.mister.discount.business;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "address")
public class Address {
	private String userName;
	private String streetName;
	private String zipCode;
	private String cityName;
	private String countryId;

	public Address() {
	}

	public Address(String userName, String streetName, String zipCode, String cityName, String countryId) {
		this.userName = userName;
		this.streetName = streetName;
		this.zipCode = zipCode;
		this.cityName = cityName;
		this.countryId = countryId;
	}

	@XmlElement(name = "userName", required = true)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@XmlElement(name = "streetName", required = true)
	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	@XmlElement(name = "zipCode", required = true)
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@XmlElement(name = "cityName", required = true)
	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@XmlElement(name = "countryId", required = true)
	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
}
