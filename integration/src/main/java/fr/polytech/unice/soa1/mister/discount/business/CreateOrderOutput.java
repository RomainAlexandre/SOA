package fr.polytech.unice.soa1.mister.discount.business;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "createOrderOutput")
public class CreateOrderOutput {
	private String orderId;
    private String cost;
    private String eta;

	public CreateOrderOutput() {
	}

	public CreateOrderOutput(String orderId, String cost, String eta) {
		this.orderId =orderId;
		this.cost =cost;
		this.eta = eta;
	}

	@XmlElement(name = "orderId", required = true)
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@XmlElement(name = "orderId", required = true)
	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@XmlElement(name = "orderId", required = true)
	public String getEta() {
		return eta;
	}

	public void setEta(String eta) {
		this.eta = eta;
	}


}
