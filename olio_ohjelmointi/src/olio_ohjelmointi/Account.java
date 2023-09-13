package olio_ohjelmointi;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Account {
    String name;
    String address;
    Double balance;

    public void display() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00", symbols);

        System.out.print(name);
        System.out.print(" (");
        System.out.print(address);
        System.out.print(") has $");
        System.out.print(df.format(balance));
    }

    public double getInterest(double percentageRate) {
        return balance * percentageRate / 100.00;
    }
}