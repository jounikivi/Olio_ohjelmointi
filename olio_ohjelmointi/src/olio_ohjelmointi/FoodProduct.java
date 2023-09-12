package olio_ohjelmointi;

public class FoodProduct {
    public String tyyppi;
    public double paino;
    public double hinta;
    public int annostenMaara;
    public double kaloreitaAnnostaKohti;

    public FoodProduct(String tyyppi, double paino, double hinta, int annostenMaara, double kaloreitaAnnostaKohti) {
        this.tyyppi = tyyppi;
        this.paino = paino;
        this.hinta = hinta;
        this.annostenMaara = annostenMaara;
        this.kaloreitaAnnostaKohti = kaloreitaAnnostaKohti;
    }

    public void näytäTiedot() {
        System.out.println("Tuotetiedot:");
        System.out.println("Tyyppi: " + tyyppi);
        System.out.println("Paino: " + paino + " grammaa");
        System.out.println("Hinta: $" + hinta);
        System.out.println("Annosten määrä: " + annostenMaara);
        System.out.println("Kaloreita annosta kohti: " + kaloreitaAnnostaKohti);
    }
    
    public void displayInfo() {
    	System.out.println("Tuotetiedot:");
        System.out.println("Tyyppi: " + tyyppi);
        System.out.println("Paino: " + paino + " grammaa");
        System.out.println("Hinta: $" + hinta);
        System.out.println("Annosten määrä: " + annostenMaara);
        System.out.println("Kaloreita annosta kohti: " + kaloreitaAnnostaKohti);
    }
}

