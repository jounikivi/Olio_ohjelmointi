package KT8;

import java.lang.ArithmeticException;

public class Esimerkki2 {

    public static void main(String[] args) {
        // Yritä jakaa 10 0:lla
        try {
            int tulos = 10 / 0;
        } catch (ArithmeticException e) {
            // Jos jaettava on nolla, käsittele poikkeus
            System.out.println("Ei voi jakaa lukua nollalla.");
        }
    }
}
