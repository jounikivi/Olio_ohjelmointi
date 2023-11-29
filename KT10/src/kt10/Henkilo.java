package kt10;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }

    public void esitteleItseasi() {
        System.out.println("Olen " + nimi + " ja olen " 
    + ika + "-vuotias.");
    }

    public String getNimi() {
        return nimi;
    }
}