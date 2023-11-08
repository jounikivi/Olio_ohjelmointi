package kotitehtävät6;

import java.util.ArrayList;

public class Jarjestalista {

    public static void main(String[] args) {

        // Luodaan lista
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(2);
        lista.add(76);
        lista.add(4);
        lista.add(8);
        lista.add(55);
        lista.add(4);
        lista.add(34);
        lista.add(7);
        lista.add(2);
        lista.add(22);
        lista.add(55);
        lista.add(4);
        lista.add(98);

        // Järjestetään lista
        lista.sort(null);

        // Tulostaadaan lista
        for (int luku = 0; luku < lista.size(); luku++) {
            System.out.println(lista.get(luku));
        }
    }
}
