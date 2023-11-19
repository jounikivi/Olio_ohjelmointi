package KT8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchEsimerkki{

    public static void main(String[] args) {
        // Yritä avata tiedosto
        try {
            FileInputStream inputStream = new FileInputStream("tiedosto.txt");
        } catch (FileNotFoundException e) {
            // Jos tiedostoa ei löydy, käsittele poikkeus
            System.out.println("Tiedostoa ei löytynyt.");
        }
    }
}
