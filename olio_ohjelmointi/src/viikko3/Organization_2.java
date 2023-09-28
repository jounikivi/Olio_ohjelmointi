package viikko3;

//Organization_2 luokka
class Organization_2 {
 private String name;
 private double annualRevenue;

 public Organization_2(String name, double annualRevenue) {
     this.name = name;
     this.annualRevenue = annualRevenue;
 }

 public String getName() {
     return name;
 }

 public double getAnnualRevenue() {
     return annualRevenue;
 }

 public double calculateTax() {
     return 0; // Perusluokka ei maksa veroa
 }
}

//ProfitMakingOrganization luokka, aliluokka
class ProfitMakingOrganization extends Organization_2 {
 public ProfitMakingOrganization(String name, double annualRevenue) {
     super(name, annualRevenue);
 }

 @Override
 public double calculateTax() {
     // ProfitMakingOrganization maksaa 10% vuosittaisesta liikevaihdostaan veroa
     return 0.10 * getAnnualRevenue();
 }
}

//NonProfitOrganization luokka, aliluokka
class NonProfitOrganization extends Organization_2 {
 public NonProfitOrganization(String name, double annualRevenue) {
     super(name, annualRevenue);
 }

 @Override
 public double calculateTax() {
     // NonProfitOrganization maksaa 2% vuosittaisesta liikevaihdostaan veroa
     return 0.02 * getAnnualRevenue();
 }
}



