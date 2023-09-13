package olio_ohjelmointi;

public class KotielainTesti {
	public static void main(String[] args) {
		Kotielain ankka = new Kotielain("Ankka", "Aku", 10, "harmaa");
		Kotielain koira = new Kotielain("koira", "Pluto", 4, "keltainen");
		
		System.out.println("Kotieläinten ominaisuudet");
		ankka.TulostaOminaisuudet();
		koira.TulostaOminaisuudet();
		
		System.out.println("\nKotieläinten ääntely");
		ankka.ääntele();
		koira.ääntele();
	}
}
