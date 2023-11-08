package kotitehtävät6;

import java.util.*;
public class Luku4 {
    /* Luodaan lista annetuista arvoista. */
    public static void main(String[] args) {
        List<Integer> luvut = new ArrayList<>();
        luvut.add(2);
        luvut.add(76);
        luvut.add(4);
        luvut.add(8);
        luvut.add(55);
        luvut.add(4);
        luvut.add(34);
        luvut.add(7);
        luvut.add(2);
        luvut.add(22);
        luvut.add(55);
        luvut.add(4);
        luvut.add(98);

        /* Luodaan muuttuja, joka tallentaa luvun 4 ilmentymien määrän. */
        int luku4 = 0;

        /* Käydään lista läpi for-silmukan avulla. */
        for (Integer luku : luvut) {

            /* Jos nykyinen ilmentymä on 4, lisätään muuttujan luku4 arvoa yhdellä. */
            if (luku == 4) {
                luku4++;
            }
        }

        /* Lopuksi tulostetaan luvun 4 esiintymiskertojen määrä. */
        System.out.println("Luku 4 esiintyy listassa " + luku4 + " kertaa.");
    }
}

