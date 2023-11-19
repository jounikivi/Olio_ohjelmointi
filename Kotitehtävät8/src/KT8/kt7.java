package KT8;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;


public class kt7 {
    public static void main(String[] args) {
        try (Scanner diskScanner = new Scanner(new File("numbers.txt"))) {
            // Luo taulukot numeraattorien ja nimittäjien tallentamiseen
            int[] numerators = new int[5];
            int[] denominators = new int[5];

            // Lue numeraattorit ja nimittäjät tiedostosta
            int i = 0;
            while (diskScanner.hasNextLine()) {
                String line = diskScanner.nextLine();
                String[] parts = line.split(",");
                numerators[i] = Integer.parseInt(parts[0]);
                denominators[i] = Integer.parseInt(parts[1]);
                i++;
            }

            // Laske ja näytä osamäärät
            for (int j = 0; j < numerators.length; j++) {
                try {
                    System.out.println(numerators[j] / denominators[j]);
                } catch (ArithmeticException e) {
                    System.out.println("Virhe: Jakaaminen nollalla.");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Virhe: Tiedostoa 'numbers.txt' ei löydy.");
        } catch (NumberFormatException e) {
            System.out.println("Virhe: Tiedostossa on virheellinen lukumuodon.");
        } catch (Exception e) {
            System.out.println("Virhe: Yllättävä poikkeus tapahtui.");
        }
    }
}


