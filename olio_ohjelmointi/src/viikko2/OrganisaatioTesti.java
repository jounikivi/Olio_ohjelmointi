package viikko2;

public class OrganisaatioTesti {
    public static void main(String[] args) {
        Organization yritys1 = new Organization("XYZ Yritys", 100000.00, true);
        Organization yritys2 = new Organization("Avustusjärjestö", 50000.00, false);
        
        System.out.println("Tiedot yritys 1;");
        yritys1.displayInfo();
        
        System.out.println("\nTiedot yritys 2:");
        yritys2.displayInfo();
    }
}

