package java_olio2;

import static java.lang.System.out;



public class UseAccount {


public static void main(String[] args) {

 

Account myAccount = new Account();

Account yourAccount = new Account();

 

myAccount.name = "Barry Burd";

myAccount.address = "Barryn osoite";

myAccount.balance = 24.02;

 

myAccount.display();

out.print(" plus $");

out.print(myAccount.getInterest(5.00));

out.println(" interest.");

 

yourAccount.name = "Jane";

yourAccount.address = "Janen osoite";

yourAccount.balance = 55.63;

 

yourAccount.display();

double yourInterestRate = 7.00;

out.print(" plus $");

double yourInterestAmount = yourAccount.getInterest(yourInterestRate);

out.print(yourInterestAmount);

out.println(" interest.");

}

 

}
