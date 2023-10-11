package kt_5;

//Tämä luokka laskee motellissa yöpyvien ihmisten kokonaismäärän.
public class FindTheTotal {

 // Tämä metodi on päämetodi, joka suoritetaan, kun ohjelma käynnistetään.
 public static void main(String[] args) {

     // Luo huoneiden taulukko.
     int[] rooms = {0, 296, 342, 405, 363, 350, 323, 101};

     // Luo muuttuja tallentamaan yöpyvien ihmisten kokonaismäärän.
     int runningTotal = 0;

     // Iteroi huoneiden taulukon yli ja lisää jokaisen huoneen yöpyvien ihmisten määrä runningTotal -muuttujaan.
     for (int i = 0; i < rooms.length; i++) {
         runningTotal += rooms[i];
     }

     // Tulosta yöpyvien ihmisten kokonaismäärä konsoliin.
     System.out.println("Yöpyvien ihmisten kokonaismäärä: " + runningTotal);
 }
}
