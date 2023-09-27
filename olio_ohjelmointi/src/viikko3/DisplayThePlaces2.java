package viikko3;

public class DisplayThePlaces2 {

	  public static void main(String[] args) {

	    // Luodaan asuinpaikkoja
	    PlaceToLive house = new PlaceToLive("Kotikatu 12", 3, 120);
	    PlaceToLive apartment = new PlaceToLive("Asuntokatu 23", 2, 70);

	    // Näytetään tietoja asuinpaikoista
	    System.out.println("** Asunto 1 **");
	    System.out.println("Osoite: " + house.getAddress());
	    System.out.println("Makuuhuoneita: " + house.getNumberOfBedrooms());
	    System.out.println("Pinta-ala: " + house.getArea() + " neliömetriä");

	    System.out.println();

	    System.out.println("** Asunto 2 **");
	    System.out.println("Osoite: " + apartment.getAddress());
	    System.out.println("Makuuhuoneita: " + apartment.getNumberOfBedrooms());
	    System.out.println("Pinta-ala: " + apartment.getArea() + " neliömetriä");

	  }

	}

