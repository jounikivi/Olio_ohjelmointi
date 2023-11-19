package KT8;
import java.util.*;
public class kt3 {
    public static void main(String[] args) {
        /*
         * Tämä luokka ottaa käyttäjältä viisi sanaa syötteenä.
         *
         * Poikkeuksia käsitellään try-catch-blokeilla.
         */

        try {
            /*
             * Hae sanat käyttäjältä.
             */
            Scanner keyboard = new Scanner(System.in);
            String[] words = new String[5];
            int i = 0;

            do {
                System.out.print("Enter word " + (i + 1) + ": ");
                words[i] = keyboard.nextLine();
                i++;
            } while (i < 5);

            /*
             * Tulosta sanat käyttäjälle.
             */
            System.out.println("\nThe words you entered are:");
            for (String word : words) {
                System.out.println(word);
            }
        } catch (InputMismatchException e) {
            /*
             * Virheellinen syöte. Käyttäjä on syöttänyt virheellisen syötteen, kuten numeron sanan sijaan.
             */
            System.out.println("Invalid input. Please enter a valid word.");
        } catch (NoSuchElementException e) {
            /*
             * Scanner-olio on saavuttanut odottamattoman syötteen loppumisen. Käyttäjä on syöttänyt vähemmän kuin viisi sanaa.
             */
            System.out.println("Scanner encountered unexpected end of input.");
        } catch (ArrayIndexOutOfBoundsException e) {
            /*
             * Indeksin ulkopuolella oleva virhe. Käyttäjä on syöttänyt yli viisi sanaa.
             */
            System.out.println("Index out of bounds error.");
        }
    }
}
