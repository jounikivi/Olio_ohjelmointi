package viikko2;

public class Ajastin {
	private int aika;
	
	public Ajastin() {
		this.aika = 0;
	}
	
	public void lisaa() {
		if  (aika + 5 <= 30) {
			aika +=5;
		}
	}
	
	public void vahenna() {
		if (aika >= 5) {
			aika -= 5;
		}
	}
	
	public int aika() {
		return aika;
	}
	
	public boolean loppu() {
		return aika == 30;
	}
}
