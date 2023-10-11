package kt_5;

public class ShortCircuitEvaluation {

  private static int roomNum;

  public static void main(String[] args) {
    int[] guests = {1, 2, 3, 4, 5};

    // Tämä koodi palauttaa aina oikean arvon.
    roomNum = 5; // Määritetään roomNum ennen sen käyttöä.
    boolean hasGuests = roomNum < 10 && guests[roomNum] != 0;

    System.out.println(hasGuests);
  }
}

