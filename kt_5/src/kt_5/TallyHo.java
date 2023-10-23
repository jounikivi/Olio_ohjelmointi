package kt_5;

import java.util.Scanner;

public class TallyHo {

    public static void main(String[] args) {
        // Luo käyttäjän syötteen lukemiseen tarkoitettu lukija.
        Scanner lukija = new Scanner(System.in);

        // Kysy motellin huoneiden lukumäärä.
        System.out.print("Anna motellin huoneiden lukumäärä: ");
        int huoneidenLkm = lukija.nextInt();

        // Luo taulukko, joka tallentaa huoneissa olevien asukkaiden lukumäärän.
        int[] huoneet = new int[huoneidenLkm];

        // Lue asukkaiden lukumäärä jokaisesta huoneesta.
        for (int huone = 0; huone < huoneidenLkm; huone++) {
            System.out.print("Anna huoneen " + (huone + 1) + " asukkaiden lukumäärä: ");
            huoneet[huone] = lukija.nextInt();
        }

        // Luo taulukko, joka tallentaa huoneiden lukumäärän jokaiselle asukkaiden lukumäärälle.
        int[] kuinkaMontaHuonettaOn = new int[2];

        // Käy motellin huoneet läpi yksitellen.
        for (int huone = 0; huone < huoneidenLkm; huone++) {
            // Tarkista, onko elementti taulukon rajojen sisäpuolella.
            if (huoneet[huone] < kuinkaMontaHuonettaOn.length) {
                // Lisää 1 vastaavaan taulukon elementtiin.
                kuinkaMontaHuonettaOn[huoneet[huone]]++;
            }
        }

        // Tulosta tulokset.
        System.out.println("Tyhjiä huoneita: " + kuinkaMontaHuonettaOn[0]);
        System.out.println("Yhden asukkaan huoneita: " + kuinkaMontaHuonettaOn[1]);
    }
}



