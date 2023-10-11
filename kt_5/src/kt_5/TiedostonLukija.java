package kt_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TiedostonLukija {

  public static void main(String[] args) throws FileNotFoundException, IOException {
    // Avaa tiedosto
    File tiedosto = new File("tiedosto.txt");
    Scanner diskScanner = new Scanner(tiedosto);

    // Lue tiedosto
    while (diskScanner.hasNextLine()) {
      System.out.println(diskScanner.nextLine());
    }

    // Sulje tiedosto
    diskScanner.close();
  }
}

