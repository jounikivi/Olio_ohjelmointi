package hotel;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ShowGuests {

	  public static void main(String[] args) {
	    // Luo taulukko
	    int[] rooms = new int[10];

	    try {
	      // Lue tiedot tiedostosta
	      Scanner input = new Scanner(new File("GuestList.txt"));

	      for (int i = 0; i < rooms.length; i++) {
	        rooms[i] = input.nextInt();
	      }
	    } catch (FileNotFoundException e) {
	      // Tiedostoa ei löydy
	      System.out.println("Tiedosto GuestList.txt ei löydy!");
	    }

	    // Tulosta tiedot
	    for (int i = 0; i < rooms.length; i++) {
	      System.out.println("Huone " + (i + 1) + ": " + rooms[i]);
	    }
	  }
	}

