package KT8;

public class Hotellikirjautiminen {

    public static void main(String[] args) {
        int ika = 70;
        int hinta = 100;
        
        // YKSI TAPA TEHDÄ TÄMÄ
        /*if (ika > 65) {
            //Saa 10 % alennuksen
            hinta *= 0.9;
            
        }*/
        
        //TOINEN TAPA TEHDÄ TÄMÄ
        double alennus = ika > 65 ? 0.9 : 1.0;
        hinta *= alennus;

        System.out.println("Hotelli laskun summa on: " + hinta);
    }
}
