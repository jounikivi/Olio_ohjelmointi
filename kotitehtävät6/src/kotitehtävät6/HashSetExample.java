package kotitehtävät6;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Luodaan HashSet merkkijonoja varten
        HashSet<String> set = new HashSet<>();

        // Lisätään elementtejä listaan
        set.add("omena");
        set.add("banaani");
        set.add("appelsiini");
        set.add("mansikka");
        set.add("appelsiini"); // Lisätään uudestaan, mutta se ei vaikuta (ei sallita duplikaatteja)

        // Tulostetaan kaikki elementit
        System.out.println("Kaikki elementit HashSetissa:");
        for (String element : set) {
            System.out.println(element);
        }

        // Tarkistetaan onko lista tyhjä
        boolean onkoTyhja = set.isEmpty();
        System.out.println("Onko HashSet tyhjä: " + onkoTyhja);

        // Etsitään tietty elementti
        String etsittava = "banaani";
        boolean loytyyko = set.contains(etsittava);
        System.out.println("Löytyykö '" + etsittava + "': " + loytyyko);

        // Poistetaan elementti
        set.remove("mansikka");

        // Uusi lista ilman "mansikka" elementtiä
        System.out.println("HashSet ilman 'mansikka' elementtiä:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}

