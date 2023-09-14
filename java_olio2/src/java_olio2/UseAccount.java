package java_olio2;

import static java.lang.System.out;

public class UseAccount {
	public static void main(String[] args) {
		Account myAccount;
		Account yourAccount;
		
		myAccount = new Account();
		yourAccount = new Account();
		
		myAccount.setName("Barry Burd");
		myAccount.setAddress("222 testikatu");
		myAccount.setBalance(24.02);
		
		yourAccount.setName("Jane Q. Public");
		yourAccount.setAddress("111 testitie");
		yourAccount.setBalance(55.63);
		
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
