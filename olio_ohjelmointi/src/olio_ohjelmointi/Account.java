package olio_ohjelmointi;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Account {
   private String name;
   private String address;
   private Double balance;

    public void display() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00", symbols);

        System.out.print(getName());
        System.out.print(" (");
        System.out.print(getAddress());
        System.out.print(") has $");
        System.out.print(df.format(getBalance()));
    }

    public double getInterest(double percentageRate) {
        return getBalance() * percentageRate / 100.00;
    }


	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
}