package viikko2;

public class Account {

	 // Käytetään private-määrettä, jotta muuttujia ei voi suoraan muuttaa ulkopuolelta
    private String name;
    private String address;
    private double balance;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.print(name);
        System.out.print(" (");
        System.out.print(address);
        System.out.print(") has $");
        System.out.print(balance);
    }

    public double getInterest(double percentageRate) {
        return balance * percentageRate / 100.00;
    }
}


	
