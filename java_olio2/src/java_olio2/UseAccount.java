package java_olio2;

import static java.lang.System.out;

public class UseAccount {
	public static void main(String[] args) {
		Account myAccount;
		Account yourAccount;
		
		myAccount = new Account();
		yourAccount = new Account();
		
		myAccount.name ="Barry Burd";
		myAccount.address = "222 testikatu";
		myAccount.balance = 24.02;
		
		yourAccount.name = "Jane Q. Public";
		yourAccount.address = "111 testitie";
		yourAccount.balance = 55.63;
		
		myAccount.display();
		out.print(" plus $");
		out.print(myAccount.getInterest(5.00));
		out.println(" interst ");
		
		yourAccount.display();
		double yourInterestRate= 7.00;
		out.print(" plus $");
		double yourInterstAmount = yourAccount.getInterest(yourInterestRate);
		out.print(yourInterstAmount);
		out.println(" interst ");
		
		
	}
}
