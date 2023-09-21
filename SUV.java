package edu.ilstu;

public class SUV extends Auto {
	private String type;
	private boolean offRoad;
	
	public SUV(String VIN, String make, String model, int year, double originalPrice, boolean offRoad) {
		super(VIN, make, model, year, originalPrice);
		this.type = "SUV";
		this.offRoad = offRoad;
	}
	
	public String toString() {
		if(offRoad)
			return super.toString() + "\nOffroad Capabilities: Yes";
		else
			return super.toString() + "\nOffroad Capabilities: No";
	}
	
	public String getType() {
		return type;
	}	
	
}
