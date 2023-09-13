package olio_ohjelmointi;

import java.text.DecimalFormat;

public class UseAccount {
    public static void main(String[] args) {
        Account myAccount;
        Account yourAccount;

        myAccount = new Account();
        yourAccount = new Account();

        myAccount.name = "Barry Burd";
        myAccount.address = "222 testikatu";
        myAccount.balance = 24.02;

        yourAccount.name = "Jane Q. Public";
        yourAccount.address = "111 testitie";
        yourAccount.balance = 55.63;

        System.out.print("Account details: ");
        myAccount.display();
        System.out.print(" plus $");
        System.out.print(new DecimalFormat("0.00").format(myAccount.getInterest(5.00)));
        System.out.println(" interest");

        System.out.print("Account details: ");
        yourAccount.display();
        double yourInterestRate = 7.00;
        System.out.print(" plus $");
        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
        System.out.print(new DecimalFormat("0.00").format(yourInterestAmount));
        System.out.println(" interest");
    }
}
