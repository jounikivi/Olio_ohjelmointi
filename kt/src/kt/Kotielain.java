package kt;

public class Kotielain {
    private String laji;
    private String nimi;
    private int ika;
    private String vari;

    public Kotielain(String laji, String nimi, int ika, String vari) {
        this.laji = laji;
        this.nimi = nimi;
        this.ika = ika;
        this.vari = vari;
    }

    public void tulostaTiedot() {
        System.out.println(laji + " \"" + nimi + "\" " + ika + " " + vari);
    }
}

