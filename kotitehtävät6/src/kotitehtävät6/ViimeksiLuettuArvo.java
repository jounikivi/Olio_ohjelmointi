package kotitehtävät6;

import java.util.*;

public class ViimeksiLuettuArvo {
    public static void main(String[] args) {
        // Luodaan ArrayList syötteiden tallentamiseksi
        ArrayList<String> syotteet = new ArrayList<>();
        
        // Luodaan Scanner syötteiden lukemiseen käyttäjältä
        Scanner lukija = new Scanner(System.in);
        
        // Kysytään käyttäjältä syötteitä ja lisätään ne ArrayListiin
        while (true) {
            System.out.print("Syötä teksti (tyhjä lopettaa): ");
            String syote = lukija.nextLine();
            
            // Tarkistetaan, onko syöte tyhjä
            if (syote.isEmpty()) {
                break; // Lopetetaan syötteiden lukeminen, jos syöte on tyhjä
            }
            
            syotteet.add(syote); // Lisätään syöte ArrayListiin
        }
        
        lukija.close(); // Suljetaan Scanner
        
        int koko = syotteet.size();
        if (koko > 0) {
            // Haetaan viimeinen syöte ArrayListista
            String viimeinenSyote = syotteet.get(koko - 1);
            
            // Tulostetaan viimeksi luettu arvo
            System.out.println("Viimeksi luettu arvo: " + viimeinenSyote);
        } else {
            System.out.println("Et antanut syötteitä.");
        }
    }
}
