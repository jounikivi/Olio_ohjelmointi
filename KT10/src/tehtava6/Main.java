package tehtava6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna numeroiden määrä numeropylväässä: ");
        int size = scanner.nextInt();

        ColumnOfNumbers column = new ColumnOfNumbers(size);

        double[] userValues = new double[size];
        System.out.println("Syötä " + size + " numeroa:");

        for (int i = 0; i < size; i++) {
            userValues[i] = scanner.nextDouble();
        }

        column.setNumbers(userValues);

        System.out.println("Syötit seuraavat numerot:");
        column.printNumbers();

        System.out.print("Haluatko poistaa numerot (K/E)? ");
        String deleteChoice = scanner.next();

        if (deleteChoice.equalsIgnoreCase("K")) {
            column.delete();
        }

        scanner.close();
    }
}
