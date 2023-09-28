package viikko3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class PlaceToLive {
    private String address;
    private int numberOfBedrooms;
    private double area;

    public PlaceToLive(String address, int numberOfBedrooms, double area) {
        this.address = address;
        this.numberOfBedrooms = numberOfBedrooms;
        this.area = area;
    }

    // Lisää tarvittavat getterit ja laskentametodit tähän

    @Override
    public String toString() {
        return "PlaceToLive{" +
                "address='" + address + '\'' +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", area=" + area +
                '}';
    }
}






