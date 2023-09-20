package viikko2;

import static java.lang.System.out;

public class Account {
	
	private String name;
	private String address;
	private Double balance;
	
	public void display() {
		out.print(getName());
		out.print("(");
		out.print(getAddress());
		out.print(") has $");
		out.print(getBalance());
	}
	
	public double getInterest(double percentageRate) {
		return getBalance() * percentageRate / 100.00;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
