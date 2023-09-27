package viikko3;

public class PlaceToLive2 {
	private String address;
	private int numberOfBedrooms;
	private double area;
	
	public PlaceToLive2(String address, int numberOfBedrooms, double area) {
	this.address = address;
	this.numberOfBedrooms = numberOfBedrooms;
	this.area = area;
	}
	public String getAddress() {
		return address;
	}
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}

	public double getArea() {
		return area;
	}
	public void displayInfo() {
	    System.out.println("Address: " + address);
	    System.out.println("Number of Bedrooms: " + numberOfBedrooms);
	    System.out.println("Area: " + area + " square meters");
	}

}

