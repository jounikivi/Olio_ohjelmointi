package olio_ohjelmointi;

import static java.lang.System.out;

public class Account {
	String name;
	String address;
	Double balance;
	
	public void display() {
		out.print(name);
		out.print("(");
		out.print(address);
		out.print(") has $");
		out.print(balance);
	}
	
}
