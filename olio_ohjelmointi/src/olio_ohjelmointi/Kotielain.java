package olio_ohjelmointi;

public class Kotielain {
	// Ominaisuudet
	String laji;
	String nimi;
	int ikä;
	String väri;
	
	public Kotielain (String laji, String nimi, int ikä, String väri ) {
		this.laji = laji;
		this.nimi = nimi;
		this.ikä = ikä;
		this.väri = väri;
	}
	 //metodi tulostusta varten
	
	public void TulostaOminaisuudet() {;
		System.out.println(laji + " \"" + nimi + "\" " + ikä + " " + väri );
	}
	
	public void ääntele() {
		if (laji.contentEquals("koira")) {
			System.out.println(nimi + " sanoo: Hau Hau");
		} else if (laji.equalsIgnoreCase("ankka")) {
			System.out.println(nimi + " sanoo: Kvaak Kvaak");
		}
	}
}
