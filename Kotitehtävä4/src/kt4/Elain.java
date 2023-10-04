package kt4;

class Elain {
    private String nimi;

    public Elain(String nimi) {
        this.nimi = nimi;
    }

    public void syo() {
        System.out.println(nimi + " syö ruokaa.");
    }
}

class Koira extends Elain {
    public Koira(String nimi) {
        // Kutsutaan yliluokan (Elain) konstruktoria "super"-avainsanalla
        super(nimi);
    }

    public void hauku() {
        System.out.println("Koira haukkuu.");
    }
}



