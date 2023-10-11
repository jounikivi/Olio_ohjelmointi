package kt_5;

import java.util.ArrayList;
import java.util.List;

//Tämä luokka löytää huoneen tai huoneet, joissa on suurin vieraiden määrä.
public class FindTheBiggest {
 // Tämä metodi on päämetodi, joka suoritetaan, kun ohjelma käynnistetään.
 public static void main(String[] args) {

     // Luo huoneiden taulukko.
     int[] rooms = {0, 296, 342, 405, 363, 350, 323, 101};

     // Luo muuttuja tallentamaan suurimman vieraiden määrän, joka on tähän mennessä nähty.
     int largestSoFar = 0;

     // Iteroi huoneiden taulukon yli ja päivitä largestSoFar aina, kun löydämme uuden ennätysmäärän.
     for (int i = 0; i < rooms.length; i++) {
         if (rooms[i] > largestSoFar) {
             largestSoFar = rooms[i];
         }
     }
     // Luo lista tallentamaan huoneiden numerot, joissa on suurin vieraiden määrä.
     List<Integer> largestRooms = new ArrayList<>();

     // Iteroi huoneiden taulukon yli uudelleen ja lisää huoneiden numerot, joissa on suurin vieraiden määrä, listaan.
     for (int i = 0; i < rooms.length; i++) {
         if (rooms[i] == largestSoFar) {
             largestRooms.add(i);
         }
     }

     // Tulosta huoneiden numerot, joissa on suurin vieraiden määrä, konsoliin.
     for (int i = 0; i < largestRooms.size(); i++) {
         System.out.println(largestSoFar + " guests in Room " + largestRooms.get(i));
     }
 }
}

