package kotitehtävät6;

import java.util.ArrayList;
import java.util.Scanner;

public class ViimeksiLuettuArvo {
    public static void main(String[] args) {
        ArrayList<String> syotteet = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        while (true) {
            System.out.print("Syötä teksti (tyhjä lopettaa): ");
            String syote = lukija.nextLine();
            
            if (syote.isEmpty()) {
                break;
            }
            
            syotteet.add(syote);
        }
        
        lukija.close();
        
        if (!syotteet.isEmpty()) {
            int viimeisenIndeksi = syotteet.size() - 1;
            String viimeinenSyote = syotteet.get(viimeisenIndeksi);
            System.out.println("Viimeksi luettu arvo: " + viimeinenSyote);
        } else {
            System.out.println("Et antanut syötteitä.");
        }
    }
}

