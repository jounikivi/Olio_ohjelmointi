package viikko2;

public class FoodProductTesti {
	 public static void main(String[] args) {
	        FoodProduct hedelma = new FoodProduct("Hedelmät", 100, 2.50, 5, 100);
	        FoodProduct leivonnaiset = new FoodProduct("Leivonnaiset", 200, 5.00, 10, 250);
	        
	        System.out.println("Tiedot hedelmistä:");
	        hedelma.displayInfo();
	        
	        System.out.println("\nTiedot leivonnaisista:");
	        leivonnaiset.displayInfo();
	        
	        // Käytetään settereitä päivittämään tietoja
	        hedelma.setTyyppi("Uudet Hedelmät");
	        hedelma.setPaino(120);
	        hedelma.setHinta(3.00);
	        hedelma.setAnnostenMaara(6);
	        hedelma.setKaloreitaAnnostaKohti(120);
	        
	        System.out.println("\nPäivitetyt tiedot hedelmistä:");
	        hedelma.displayInfo();
	    }
	}
	



