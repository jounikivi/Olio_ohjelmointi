package viikko2;

public class OrganisaatioTesti {
    public static void main(String[] args) {
        Organization yritys1 = new Organization("XYZ Yritys", 100000.00, true);
        Organization yritys2 = new Organization("Avustusjärjestö", 50000.00, false);
        
        System.out.println("Tiedot yritys 1:");
        yritys1.displayInfo();
        
        System.out.println("\nTiedot yritys 2: ");
        yritys2.displayInfo();
        
        //Esim: setterin käytöstä
        yritys1.setNimi("Uusi Nimi");
        yritys1.setVuosittainenTulo(120000.00);
        yritys1.setVoittoaTavoitteleva(false);
        
        //Näytetään päivitetyt tiedot
        System.out.println("\nPäivitetyt tiedot yritys 1;");
        yritys1.displayInfo();
    }
}

