package kotitehtävät6;

import java.util.Arrays;

public class Lista {

	  public static void main(String[] args) {
	    // Luo lista
	    int[] lista = {2, 76, 4, 8, 55, 4, 34, 7, 2, 22, 55, 4, 98};

	    // Selvitä, sisältääkö lista luvun 4
	    int indeksi = Arrays.binarySearch(lista, 4);

	    // Tulosta tulos
	    if (indeksi >= 0) {
	      System.out.println("Lista sisältää luvun 4.");
	    } else {
	      System.out.println("Lista ei sisällä luvun 4.");
	    }
	  }
	}

