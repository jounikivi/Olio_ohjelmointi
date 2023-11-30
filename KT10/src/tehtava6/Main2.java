package tehtava6;

import java.util.Scanner;


//DeletableColumnOfNumbers luokka
class DeletableColumnOfNumbers implements Deletable {
 private double[] numbers;

 DeletableColumnOfNumbers(int size) {
     numbers = new double[size];
 }

 // Metodi numeroiden asettamiseksi
 void setNumbers(double[] values) {
     for (int i = 0; i < values.length && i < numbers.length; i++) {
         numbers[i] = values[i];
     }
 }

 // Metodi numeroiden tulostamiseksi
 void printNumbers() {
     System.out.print("Numerot: ");
     for (double num : numbers) {
         System.out.print(num + " ");
     }
     System.out.println();
 }

 // Poistetaan numerot, asetetaan arvot nollaksi
 @Override
 public void delete() {
     for (int i = 0; i < numbers.length; i++) {
         numbers[i] = 0.0;
     }
     System.out.println("Numerot poistettu: Kaikki arvot asetettu nollaksi");
 }
}

public class Main2 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Anna numeroiden määrä numeropylväässä: ");
     int size = scanner.nextInt();

     DeletableColumnOfNumbers column = new DeletableColumnOfNumbers(size);

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

