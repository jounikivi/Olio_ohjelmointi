package viikko2;;

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

    public String getTyyppi() {
		return tyyppi;
	}

	public void setTyyppi(String tyyppi) {
		if (tyyppi != null && !tyyppi.isEmpty()) {
			this.tyyppi = tyyppi;
		} else {
			System.out.println("Virhe: Tyyppi ei voi olla tyhjä");
		}
	}

	public double getPaino() {
		return paino;
	}

	public void setPaino(double paino) {
		if (paino >= 0) {
			this.paino = paino;
		} else {
			System.out.println("Virhe: Paino ei voi olla tyhjä");
		}
	}

	public double getHinta() {
		return hinta;
	}

	public void setHinta(double hinta) {
		if (hinta >= 0) {
			this.hinta = hinta;
		}
		else {
			System.out.println("Virhe: Hinta ei voi olla negatiivinen");
		}
	}

	public int getAnnostenMaara() {
		return annostenMaara;
	}

	public void setAnnostenMaara(int annostenMaara) {
		if (annostenMaara >=0) {
			this.annostenMaara = annostenMaara;
		} else {
			System.out.println("Virhe: Annosten määrä ei voi olla negatiivinen");
		}
	}

	public double getKaloreitaAnnostaKohti() {
		return kaloreitaAnnostaKohti;
	}

	public void setKaloreitaAnnostaKohti(double kaloreitaAnnostaKohti) {
		if (kaloreitaAnnostaKohti >= 0) {
			this.kaloreitaAnnostaKohti = kaloreitaAnnostaKohti;
		} else {
			System.out.println("Virhe: Kalorimäärä ei voi olla negatiivinen");
		}
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

