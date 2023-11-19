package KT8;

import java.util.Scanner;

public class kt7 {
    public static void main(String[] args) {
        try {
            // Create a Scanner object to read the "numbers.txt" file
            Scanner diskScanner = new Scanner(new File("numbers.txt"));

            // Initialize arrays to store numerators and denominators
            int[] numerators = new int[5];
            int[] denominators = new int[5];

            // Read the numerators and denominators from the file
            int i = 0;
            while (diskScanner.hasNextLine()) {
                String line = diskScanner.nextLine();
                String[] parts = line.split(",");
                numerators[i] = Integer.parseInt(parts[0]);
                denominators[i] = Integer.parseInt(parts[1]);
                i++;
            }

            // Calculate and display the quotients
            for (int j = 0; j < numerators.length; j++) {
                try {
                    System.out.println(numerators[j] / denominators[j]);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero.");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File 'numbers.txt' not found.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format in file.");
        } catch (Exception e) {
            System.out.println("Error: Unexpected exception occurred.");
        }
    }
}

