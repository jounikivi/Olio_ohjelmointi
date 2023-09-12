package olio_ohjelmointi;

public class Organization {
    private String nimi;
    private double vuosittainenTulo;
    private boolean voittoaTavoitteleva;

    public Organization(String nimi, double vuosittainenTulo, boolean voittoaTavoitteleva) {
        this.nimi = nimi;
        this.vuosittainenTulo = vuosittainenTulo;
        this.voittoaTavoitteleva = voittoaTavoitteleva;
    }

    public void näytäTiedot() {
        System.out.println("Organisaation nimi: " + nimi);
        System.out.println("Vuosittainen tulo: $" + vuosittainenTulo);
        System.out.println("Voittoa tavoitteleva: " + (voittoaTavoitteleva ? "Kyllä" : "Ei"));
    }
    
    public void displayInfo() {
    	System.out.println("Organisaation nimi: " + nimi);
    	System.out.println("Vuosittainen tulo: $" + vuosittainenTulo);
    	System.out.println("Voittoa tavoitteleva: "+ (voittoaTavoitteleva ? "Kyllä" : "Ei"));
    }
}

