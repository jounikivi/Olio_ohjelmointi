package kt_5;

import java.util.Arrays;

public class tehtävä7 {

  private static int roomNum;

public static void main(String[] args) {
    int[] guests = {1, 2, 3, 4, 5};

    // Tämä koodi voi palauttaa virheellisen arvon, jos roomNum on suurempi tai yhtä suuri kuin 10.
    boolean hasGuests = guests[5] != 0 && roomNum < 10;

    // Tämä koodi palauttaa aina oikean arvon.
    int roomNum = 5;
    hasGuests = roomNum < 10 && guests[roomNum] != 0;

    System.out.println(hasGuests);
  }
}






