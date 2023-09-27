package viikko3;



class Asuinpaikka {
    private String osoite;
    private int makuuhuoneidenLkm;
    private double pintaAla;

    public Asuinpaikka(String osoite, int makuuhuoneidenLkm, double pintaAla) {
        this.osoite = osoite;
        this.makuuhuoneidenLkm = makuuhuoneidenLkm;
        this.pintaAla = pintaAla;
    }

    public String getOsoite() {
        return osoite;
    }

    public int getMakuuhuoneidenLkm() {
        return makuuhuoneidenLkm;
    }

    public double getPintaAla() {
        return pintaAla;
    }

    public void tulostaTiedot() {
        System.out.println("Osoite: " + osoite);
        System.out.println("Makuuhuoneiden lukumäärä: " + makuuhuoneidenLkm);
        System.out.println("Pinta-ala: " + pintaAla + " neliömetriä");
    }
}



