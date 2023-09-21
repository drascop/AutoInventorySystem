package edu.ilstu;

public class Truck extends Auto {
	private String type;
	private int towingCapacity;
	
	public Truck(String VIN, String make, String model, int year, double originalPrice, int towingCapacity) {
		super(VIN, make, model, year, originalPrice);
		this.type = "Truck";
		this.towingCapacity = towingCapacity;
	}
	
	public String toString() {
		return super.toString() +"\nTowing Capacity: "+towingCapacity +"lbs";
	}
	
	public String getType() {
		return type;
	}
}
