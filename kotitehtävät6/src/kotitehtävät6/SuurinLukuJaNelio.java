package kotitehtävät6;

import java.util.*;

public class SuurinLukuJaNelio {
    public static void main(String[] args) {
        // Luodaan ArrayList lukuja varten
        ArrayList<Integer> luvut = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Syötä positiivisia lukuja (lopeta negatiivisella luvulla): ");
        
        int syote;
        do {
            syote = lukija.nextInt();
            
            // Lisätään positiivinen syöte listalle
            if (syote >= 0) {
                luvut.add(syote);
            }
        } while (syote >= 0); // Lopetetaan, kun syöte on negatiivinen
        
        lukija.close();
        
        if (!luvut.isEmpty()) {
            int suurinLuku = luvut.get(0);
            
            // Etsitään suurin luku listalta
            for (int luku : luvut) {
                if (luku > suurinLuku) {
                    suurinLuku = luku;
                }
            }
            
            // Lasketaan suurimman luvun neliö
            int nelio = suurinLuku * suurinLuku;
            System.out.println("Suurin luku: " + suurinLuku);
            System.out.println("Suurimman luvun neliö: " + nelio);
        } else {
            System.out.println("Et antanut positiivisia lukuja.");
        }
    }
}
