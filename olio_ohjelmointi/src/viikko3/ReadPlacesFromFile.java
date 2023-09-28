package viikko3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadPlacesFromFile {
    public static void main(String[] args) {
        List<PlaceToLive> places = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("paikat.txt"))) {
            String line;
            String address = null;
            int numberOfBedrooms = 0;
            double area = 0.0;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Osoite: ")) {
                    address = line.substring(8); // Poista "Osoite: " -osa
                } else if (line.startsWith("Makuuhuoneiden lukumäärä: ")) {
                    numberOfBedrooms = Integer.parseInt(line.substring(26));
                } else if (line.startsWith("Pinta-ala (neliömetriä): ")) {
                    area = Double.parseDouble(line.substring(25));
                    // Luo uusi PlaceToLive-instanssi ja lisää se listalle
                    PlaceToLive place = new PlaceToLive(address, numberOfBedrooms, area);
                    places.add(place);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Tulosta paikkojen tiedot
        for (PlaceToLive place : places) {
            System.out.println(place);
        }
    }
}