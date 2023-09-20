package viikko2;

public class UseAccount {

    public static void main(String[] args) {

        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.setName("Barry Burd");
        myAccount.setAddress("Barryn osoite");
        myAccount.setBalance(24.02);

        myAccount.display();
        System.out.print(" plus $");
        double interest = myAccount.getInterest(5.00);
        System.out.printf("%.2f", interest); // Näytetään 2 desimaalia
        System.out.println(" interest.");

        yourAccount.setName("Jane");
        yourAccount.setAddress("Janen osoite");
        yourAccount.setBalance(55.63);

        yourAccount.display();
        double yourInterestRate = 7.00;
        System.out.print(" plus $");
        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
        System.out.printf("%.2f", yourInterestAmount); // Näytetään 2 desimaalia
        System.out.println(" interest.");
    }
}
