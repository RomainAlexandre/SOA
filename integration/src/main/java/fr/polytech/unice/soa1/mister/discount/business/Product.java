package fr.polytech.unice.soa1.mister.discount.business;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement(name = "product")
public class Product {
    private String productId;
    private int quantity;
    private String name;
    private int price;

    public Product() {
    }

    public Product(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Product){
            Product q = (Product) obj;
            return this.getProductId().equals(q.getProductId());
        }
        return false;
    }

    @XmlElement(name = "product_id", required = true)
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

    @XmlElement(name = "quantity", required = true)
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@XmlElement(name = "name", required = true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "price", required = true)
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
