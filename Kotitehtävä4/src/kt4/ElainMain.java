package kt4;

public class ElainMain {
    public static void main(String[] args) {
        Koira koira = new Koira("Musti");
        koira.syo();  // Kutsutaan yliluokan (Elain) metodia
        koira.hauku();  // Kutsutaan aliluokan (Koira) metodia
    }
}