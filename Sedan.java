package edu.ilstu;

public class Sedan extends Auto {
	private String type;
	private int capacity;
	
	public Sedan(String VIN, String make, String model, int year, double originalPrice, int capacity) {
		super(VIN, make, model, year, originalPrice);
		this.type = "Sedan";
		this.capacity = capacity;
	}
	
	public String toString() {
		return super.toString() + "\nPassenger Capacity: "+capacity;
	}
	
	public String getType() {
		return type;
	}
}
