package kotitehtävät6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
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

        int luku = 4;

        // Linear search
        boolean löytyy = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == luku) {
                löytyy = true;
                break;
            }
        }
        System.out.println("Linear search: " + löytyy);

        // Binary search
        löytyy = false;
        lista.sort(null);
        int ala = 0;
        int ylä = lista.size() - 1;
        while (ala <= ylä) {
            int keski = (ala + ylä) / 2;
            if (lista.get(keski) == luku) {
                löytyy = true;
                break;
            } else if (luku < lista.get(keski)) {
                ylä = keski - 1;
            } else {
                ala = keski + 1;
            }
        }
        System.out.println("Binary search: " + löytyy);

        // Contains-metodi
        löytyy = lista.contains(luku);
        System.out.println("Contains-metodi: " + löytyy);
    }
}

