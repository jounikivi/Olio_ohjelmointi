package kotitehtävät6;

import java.util.HashMap;
import java.util.*;

public class HashMapEsimerkki {
    public static void main(String[] args) {
        // Luodaan uusi HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Lisätään avain-arvo -pari
        hashMap.put("Omena", 5);
        hashMap.put("Banaani", 3);
        hashMap.put("Appelsiini", 7);

        // Hae arvo avaimen perusteella
        int omenienMaara = hashMap.get("Omena");
        System.out.println("Omenia on: " + omenienMaara);

        // Poista avain-arvo -pari
        hashMap.remove("Banaani");

        // Tarkista, onko avain olemassa
        boolean onkoAppelsiini = hashMap.containsKey("Appelsiini");
        System.out.println("Onko appelsiini listalla: " + onkoAppelsiini);

        // Järjestä avaimet (merkkijonot) aakkosjärjestykseen
        Set<String> avaimet = hashMap.keySet();
        System.out.println("Avaimet aakkosjärjestyksessä: " + avaimet);
    }
}

