package kt_5;

public class ShortCircuitEvaluation {

  public static void main(String[] args) {
    int[] guests = {1, 2, 3, 4, 5};

    int roomNum = 5;
    boolean hasGuests = roomNum < 10 && guests[roomNum] != 0;

    System.out.println(hasGuests);
  }
}



