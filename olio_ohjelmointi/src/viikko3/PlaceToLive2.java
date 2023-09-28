package viikko3;

import java.util.Scanner;
import java.util.Locale;

class PlaceToLive2 {
    private String address;
    private int numberOfBedrooms;
    private double area;

    public PlaceToLive2(String address, int numberOfBedrooms, double area) {
        this.address = address;
        this.numberOfBedrooms = numberOfBedrooms;
        this.area = area;
    }

    public double calculatePricePerSquareFoot(double cost) {
        return cost / area;
    }

    public double calculatePricePerBedroom(double cost) {
        return cost / numberOfBedrooms;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "PlaceToLive{" +
                "address='" + address + '\'' +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", area=" + area +
                '}';
    }
}



