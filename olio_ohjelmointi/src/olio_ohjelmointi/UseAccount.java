package olio_ohjelmointi;

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
		
		out.print(myAccount.name);
		out.print(" (");
		out.print(myAccount.address);
		out.print(") has $");
		out.print(myAccount.balance);
		out.println();
		
		out.print(yourAccount.name);
		out.print(" (");
		out.print(yourAccount.address);
		out.print(") has $");
		out.print(yourAccount.balance);
		out.println();
	}
}
