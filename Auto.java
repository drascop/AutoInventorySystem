package edu.ilstu;

public abstract class Auto implements AutoInterface {
	private String VIN,make,model;
	private int year;
	private double originalPrice;
	
	public Auto(String VIN, String make, String model, int year, double originalPrice) {
		this.VIN = VIN;
		this.make = make;
		this.model = model;
		this.year = year;
		this.originalPrice = originalPrice;
	}
	
	public double calcMSRP() {
		return originalPrice - (originalPrice * ((2023-year)*0.05) );
	}
	
	public String getType() {
		return "Auto";
	}
	
	public String toString() {
		return "Make: "+make+"\nModel: "+model+"\nMSRP: $"+(int)calcMSRP() + "\nVIN: "+VIN+"\nYear: "+year;
	}
	
}
