package fr.unice.polytech.soa1.warehouse.business;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class Coordinate {
	private int floor;
	private int corridor;
	private int rack;
	
	public Coordinate(){
		this(-1, -1, -1);
	}
	
	public Coordinate(int floor, int corridor, int rack){
		this.floor = floor;
		this.corridor = corridor;
		this.rack = rack;
	}
	
	public Coordinate(Coordinate that){
		this.floor = that.floor;
		this.corridor = that.corridor;
		this.rack = that.rack;
	}

	@XmlElement(name="floor")
	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@XmlElement(name="corridor")
	public int getCorridor() {
		return corridor;
	}

	public void setCorridor(int corridor) {
		this.corridor = corridor;
	}


	@XmlElement(name="rack")
	public int getNumber() {
		return rack;
	}

	public void setNumber(int rack) {
		this.rack = rack;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + corridor;
		result = prime * result + floor;
		result = prime * result + rack;
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
		Coordinate other = (Coordinate) obj;
		if (corridor != other.corridor)
			return false;
		if (floor != other.floor)
			return false;
		if (rack != other.rack)
			return false;
		return true;
	}
	
	
}
