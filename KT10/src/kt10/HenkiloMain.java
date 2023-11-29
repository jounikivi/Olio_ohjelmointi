package kt10;

public class HenkiloMain {

    public static void main(String[] args) {
        Henkilo pekka = new Henkilo("Pekka", 30);

        // public-jäseniä voidaan käyttää missä tahansa luokassa
        pekka.esitteleItseasi();

        // private-jäsenen arvo voidaan saada käyttöön `getNimi()`-metodin kautta
        System.out.println(pekka.getNimi());
    }
}
