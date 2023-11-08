package kotitehtävät6;

import java.util.ArrayList;
import java.util.Arrays;

public class VertaaListoja {
    public static void main(String[] args) {
        // Luodaan kaksi merkkijonolistaa
        ArrayList<String> lista1 = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
        ArrayList<String> lista2 = new ArrayList<>(Arrays.asList("D", "C", "E", "B", "A")); // Listojen järjestystä on vaihdettu
        
        // Vertaillaan listoja
        if (vertaaListoja(lista1, lista2)) {
            System.out.println("Samat");
        } else {
            System.out.println("Erit");
        }
    }
    
    // Vertaa kahta listaa
    public static boolean vertaaListoja(ArrayList<String> lista1, ArrayList<String> lista2) {
        // Tarkistetaan, ovatko listojen koot samat
        if (lista1.size() != lista2.size()) {
            return false;
        }
        
        // Luodaan kopiot listoista, jotta alkuperäiset listat eivät muutu
        ArrayList<String> kopio1 = new ArrayList<>(lista1);
        ArrayList<String> kopio2 = new ArrayList<>(lista2);
        
        // Järjestetään kopioidut listat, jotta niitä voidaan vertailla järjestyksestä riippumatta
        kopio1.sort(String.CASE_INSENSITIVE_ORDER);
        kopio2.sort(String.CASE_INSENSITIVE_ORDER);
        
        // Tarkistetaan, ovatko kopioidut listat samat
        return kopio1.equals(kopio2);
    }
}

