package fr.unice.polytech.soa1.jcolinet.business;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
@XmlRootElement(name = "product")
public class Product {
	private String id;
	private int width;
	private int height;
	private int depth;
	
	public Product(){
		this("", -1, -1, -1);
	}
	
	public Product(String id, int width, int height, int depth){
		this.id = id;
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public Product(Product that){
		this.id = that.id;
		this.width = that.width;
		this.height = that.height;
		this.depth = that.depth;
	}

	@XmlElement(name="id")
	@XmlID
	public String getId() {
		return id;
	}

	public void setId(String ref) {
		this.id = ref;
	}


	@XmlElement(name="width")
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}


	@XmlElement(name="height")
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	@XmlElement(name="depth")
	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
