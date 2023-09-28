package viikko3;

//Luokka, joka luo ja näyttää organisaatio-instansseja
public class OrganizationMain {
public static void main(String[] args) {
   ProfitMakingOrganization profitOrg = new ProfitMakingOrganization("ABC Inc.", 1000000.0);
   NonProfitOrganization nonProfitOrg = new NonProfitOrganization("XYZ Foundation", 500000.0);

   // Tulostetaan tietoa kustakin organisaatiosta ja niiden maksamasta verosta
   System.out.println("Profit-Making Organization:");
   System.out.println("Nimi: " + profitOrg.getName());
   System.out.println("Vuotuinen liikevaihto: $" + profitOrg.getAnnualRevenue());
   System.out.println("Maksettava vero: $" + profitOrg.calculateTax());

   System.out.println();

   System.out.println("Non-Profit Organization:");
   System.out.println("Nimi: " + nonProfitOrg.getName());
   System.out.println("Vuotuinen liikevaihto: $" + nonProfitOrg.getAnnualRevenue());
   System.out.println("Maksettava vero: $" + nonProfitOrg.calculateTax());
}
}
