package fr.polytech.unice.soa1.mister.discount.business;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "createOrderInput")
public class CreateOrderInput {
	private List<String> productsId;
	private String name;
	private String streetName;
	private int zipCode;
	private String cityName;
	private String countryId;
	private String cardNumber;

	public CreateOrderInput() {
	}

	public CreateOrderInput(String name, List<String> productsId,
			String streetName, int zipCode, String cityName, String countryId, String cardNumber) {
		this.name = name;
		this.productsId = productsId;
		this.streetName = streetName;
		this.zipCode = zipCode;
		this.cityName = cityName;
		this.countryId = countryId;
		this.cardNumber = cardNumber;
	}

	@XmlElement(name = "name", required = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "productsId", required = true)
	public List<String> getProductsId() {
		return productsId;
	}

	public void setProductsId(List<String> productsId) {
		this.productsId = productsId;
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

	@XmlElement(name = "cardNumber", required = true)
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	

}
