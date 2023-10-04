package kt4;

public class Henkilo {
	private String nimi;
    private double paino;
    private double pituus;
    
    public Henkilo(String nimi) {
    	this.nimi = nimi;
    	this.paino = 0;
    	this.pituus = 0;
    }
    
    public void setPituus(double pituus) {
    	this.pituus = pituus;
    }
    
    public void setPaino(double paino) {
    	this.paino = paino;
    }
    
    public double painoindeksi() {
        if (pituus <= 0 || paino <= 0) {
            return 0; n
        }
        double pituusMetreina = pituus / 100.0; 
        return paino / (pituusMetreina * pituusMetreina);
    }

    public void display() {
        double bmi = painoindeksi();
        System.out.println(nimi + ", painoindeksisi on " + String.format("%.2f", bmi) + ".");
    }
}
