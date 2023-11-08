package kotitehtävät6;

import java.util.ArrayList;
import java.util.Scanner;

public class LoytyykoListalta {
    public static void main(String[] args) {
        // Luodaan ArrayList merkkijonoja varten
        ArrayList<String> merkkijonot = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        // Luetaan käyttäjältä syötteitä ja lisätään ne listalle
        System.out.println("Syötä merkkijonoja (lopeta tyhjällä merkkijonolla):");
        while (true) {
            System.out.print("Syöte: ");
            String syote = lukija.nextLine();
            
            // Tarkistetaan, onko syöte tyhjä
            if (syote.isEmpty()) {
                break;
            }
            
            merkkijonot.add(syote);
        }
        
        // Suljetaan Scanner
        lukija.close();
        
        // Kysytään, mitä käyttäjä haluaa etsiä
        Scanner etsintaLukija = new Scanner(System.in);
        System.out.print("Syötä etsittävä merkkijono: ");
        
        // Tarkistetaan, onko käyttäjältä saatavilla uutta syötettä
        if (etsintaLukija.hasNextLine()) {
            String etsittava = etsintaLukija.nextLine();
            
            // Tarkistetaan, onko etsittävä merkkijono listalla
            boolean loytyy = merkkijonot.contains(etsittava);
            etsintaLukija.close();
            
            if (loytyy) {
                System.out.println("Etsittävä merkkijono '" + etsittava + "' löytyy listalta.");
            } else {
                System.out.println("Etsittävää merkkijonoa '" + etsittava + "' ei löydy listalta.");
            }
        } else {
            System.out.println("Et antanut etsittävää merkkijonoa.");
        }
    }
}
