package kt10;

public class Henkilo {

    private String nimi;
    private int ika;

    public Henkilo(String nimi, int ika) {
        this.nimi = nimi;
        this.ika = ika;
    }

    public void esitteleItseasi() {
        System.out.println("Olen " + nimi + " ja olen " + ika + "-vuotias.");
    }

    public String getNimi() {
        return nimi;
    }
}

public class Main {

    public static void main(String[] args) {
        Henkilo pekka = new Henkilo("Pekka", 30);

        // public-jäseniä voidaan käyttää missä tahansa luokassa
        pekka.esitteleItseasi();

        // private-jäsenen arvo voidaan saada käyttöön `getNimi()`-metodin kautta
        System.out.println(pekka.getNimi());
    }
}
