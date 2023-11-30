package tehtava6;

//ColumnOfNumbers luokka
public class ColumnOfNumbers implements Deletable {
 private double[] numbers;

 public ColumnOfNumbers(int size) {
     numbers = new double[size];
 }

 public void setNumbers(double[] values) {
     for (int i = 0; i < values.length && i < numbers.length; i++) {
         numbers[i] = values[i];
     }
 }

 public void printNumbers() {
     System.out.print("Numerot: ");
     for (double num : numbers) {
         System.out.print(num + " ");
     }
     System.out.println();
 }

 @Override
 public void delete() {
     for (int i = 0; i < numbers.length; i++) {
         numbers[i] = 0.0;
     }
     System.out.println("Numerot poistettu: Kaikki arvot asetettu nollaksi");
 }
}

