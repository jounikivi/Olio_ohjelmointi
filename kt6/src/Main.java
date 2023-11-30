
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anna numeroiden määrä numeropylväässä: ");
        int size = scanner.nextInt();

        double[] numbers = new double[size];

        System.out.println("Syötä " + size + " numeroa:");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextDouble();
        }

        System.out.println("Syötit seuraavat numerot:");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Haluatko poistaa numerot (K/E)? ");
        String deleteChoice = scanner.next();

        if (deleteChoice.equalsIgnoreCase("K")) {
            for (int i = 0; i < size; i++) {
                numbers[i] = 0.0;
            }
            System.out.println("Numerot poistettu: Kaikki arvot asetettu nollaksi");
        }

        scanner.close();
    }
}
