package kt_5;

import java.util.Scanner;

public class TooManyWords {

  public static void main(String[] args) {
    // Luodaan taulukko tallentamaan sanojen määrän jokaisella sivulla
    int[] words = {0, 296, 342, 405, 363, 350, 323, 101};

    // Luodaan Scanner-olio käyttäjän syötteen lukemiseen
    Scanner scanner = new Scanner(System.in);

    // Kysytään käyttäjältä sivunumero
    System.out.println("Anna sivunumero: ");
    int pageNumber = scanner.nextInt();

    // Tarkistetaan, onko sivunumero kelvollinen
    if (pageNumber < 1 || pageNumber > 7) {
      System.out.println("Kelvoton sivunumero.");
      System.exit(1);
    }

    // Haetaan sanojen määrä pyydetyltä sivulta
    int wordCount = words[pageNumber - 1];

    // Tulostetaan sanojen määrä pyydetyltä sivulta
    System.out.println("Sivulla " + pageNumber + " on " + wordCount + " sanaa.");
  }
}

