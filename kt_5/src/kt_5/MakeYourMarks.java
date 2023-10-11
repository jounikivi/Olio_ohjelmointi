package kt_5;

import java.util.Scanner;

import java.util.Scanner;

public class MakeYourMarks {

    // Luon funktio, joka ottaa taulukon syötteenä ja palauttaa arvon taulukossa olevien komponenttien perusteella
    static String tulostaTähdet(int[] komponentit) {
        String tulos = "";
        for (int i = 0; i < komponentit.length; i++) {
            for (int j = 0; j < komponentit[i]; j++) {
                tulos += "*";
            }
            tulos += "\n";
        }
        return tulos;
    }

    public static void main(String[] args) {
        // Luon taulukko komponenttien arvojen tallentamiseen
        int[] komponentit = new int[5];

        // Käytän silmukkaa komponenttien arvojen lukemiseen käyttäjältä
        Scanner scanner = new Scanner(System.in);
        System.out.println("Syötä 5 lukua: ");
        for (int i = 0; i < komponentit.length; i++) {
            komponentit[i] = scanner.nextInt();
        }

        // Kutsun funktiota taulukon syötteenä ja tulosta palautettu arvo konsoliin
        System.out.println(tulostaTähdet(komponentit));
    }
}


