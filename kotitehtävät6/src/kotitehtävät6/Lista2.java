package kotitehtävät6;

import java.util.*;

public class Lista2 {

    /*
     * Luodaan lista annetuista arvoista.
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 76, 4, 8, 55, 4, 34, 7, 2, 22, 55, 4, 98);

        /*
         * Luodaan muuttuja, joka tallentaa luvun 4 ilmentymien määrän.
         */
        int count = 0;

        /*
         * Käydään lista läpi for-silmukan avulla.
         */
        for (Integer i : list) {

            /*
             * Jos nykyinen ilmentymä on 4, lisätään muuttujan count arvoa yhdellä.
             */
            if (i == 4) {
                count++;
            }
        }

        /*
         * Tarkistetaan, onko muuttujan count arvo 2. Jos se on, lista sisältää kaksi instanssia luvusta 4.
         */
        if (count == 2) {
            System.out.println("Lista sisältää kaksi instanssia luvusta 4.");
        } else {
            System.out.println("Lista ei sisällä kahta instanssia luvusta 4.");
        }
    }
}

