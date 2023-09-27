package viikko3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlaceToLive {
    private String address;
    private int numberOfBedrooms;
    private double area;

    public PlaceToLive(String address, int numberOfBedrooms, double area) {
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

    // Tallenna PlaceToLive-tiedot tiedostoon
    public void saveToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(address);
            writer.newLine();
            writer.write(Integer.toString(numberOfBedrooms));
            writer.newLine();
            writer.write(Double.toString(area));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Lue PlaceToLive-tiedot tiedostosta ja luo instanssi
    public static PlaceToLive loadFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String address = reader.readLine();
            int numberOfBedrooms = Integer.parseInt(reader.readLine());
            double area = Double.parseDouble(reader.readLine());
            return new PlaceToLive(address, numberOfBedrooms, area);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Esimerkki kuinka tallentaa ja lukea PlaceToLive-instanssi tiedostosta
        PlaceToLive place = new PlaceToLive("123 Main St", 3, 150.5);
        place.saveToFile("place.txt");

        PlaceToLive loadedPlace = PlaceToLive.loadFromFile("place.txt");
        if (loadedPlace != null) {
            loadedPlace.displayInfo();
        }
    }
}


