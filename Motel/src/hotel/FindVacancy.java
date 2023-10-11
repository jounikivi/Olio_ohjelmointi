package hotel;

import java.io.*;
import java.util.Scanner;

public class FindVacancy {
    public static void main(String[] args) throws IOException {
        int[] guests = new int[10];
        int roomNum;

        // Avaa tiedosto "GuestList.txt" ja lue huoneiden vierasmäärät taulukkoon
        var diskScanner = new Scanner(new File("GuestList.txt"));
        for (roomNum = 0; roomNum < 10; roomNum++) {
            guests[roomNum] = diskScanner.nextInt();
        }
        diskScanner.close();

        roomNum = 0;
        
        // Etsi ensimmäinen vapaa huone
        while (roomNum < 10 && guests[roomNum] != 0) {
            roomNum++;
        }
        
        if (roomNum == 10) {
            System.out.println("Sorry, no vacancy"); // Kaikki huoneet ovat varattuja
        } else {
            System.out.print("How many people for room ");
            System.out.print(roomNum);
            System.out.print("? ");
            
            // Kysy uusien asiakkaiden määrä ja tallenna taulukkoon
            var keyboard = new Scanner(System.in);
            guests[roomNum] = keyboard.nextInt();
            keyboard.close();
            
            // Päivitä tiedosto "GuestList.txt" uusilla tiedoilla
            var listOut = new PrintStream("GuestList.txt");
            for (roomNum = 0; roomNum < 10; roomNum++) {
                listOut.print(guests[roomNum]);
                listOut.print(" ");
            }
            listOut.close();
        }
    }
}
