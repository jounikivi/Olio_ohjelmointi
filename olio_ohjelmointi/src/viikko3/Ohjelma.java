package viikko3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ohjelma {
    public static void main(String[] args) {
        // Luetaan tiedosto ja tulostetaan sen sisältö
        String tiedostonPolku = "C:\\Users\\jouni\\OneDrive\\Desktop\\Olio_ohjelmointi\\tiedostonnimi.txt";
        
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(tiedostonPolku))) {
            String rivi;
            System.out.println("Tiedoston sisältö:");
            while ((rivi = bufferedReader.readLine()) != null) {
                System.out.println(rivi);
            }
        } catch (IOException e) {
            System.err.println("Virhe tiedoston lukemisessa: " + e.getMessage());
        }
    }
}

