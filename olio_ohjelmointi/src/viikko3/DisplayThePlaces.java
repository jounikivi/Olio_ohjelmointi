package viikko3;

import java.util.Scanner;

public class DisplayThePlaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asetetaan paikat
        PlaceToLive place1 = createPlace(scanner);
        PlaceToLive place2 = createPlace(scanner);

        // Lue elinkustannukset paikoille
        double cost1 = readCost(scanner);
        double cost2 = readCost(scanner);

        // Tulosta tiedot paikoista ja hinta per neliöjalka ja hinta per makuuhuone
        displayPlaceInfo(place1, cost1);
        displayPlaceInfo(place2, cost2);
    }

    public static PlaceToLive createPlace(Scanner scanner) {
        System.out.println("Syötä paikan tiedot:");
        System.out.print("Osoite: ");
        String address = scanner.nextLine();
        System.out.print("Makuuhuoneiden lukumäärä: ");
        int numberOfBedrooms = scanner.nextInt();
        System.out.print("Pinta-ala (neliömetriä): ");
        double area = scanner.nextDouble();

        // Tyhjennä rivinvaihto
        scanner.nextLine();

        return new PlaceToLive(address, numberOfBedrooms, area);
    }

    public static double readCost(Scanner scanner) {
        System.out.print("Syötä elinkustannukset: ");
        double cost = scanner.nextDouble();

        // Tyhjennä rivinvaihto
        scanner.nextLine();

        return cost;
    }

    public static void displayPlaceInfo(PlaceToLive place, double cost) {
        System.out.println("Paikka: " + place.getAddress());
        System.out.println("Hinta per neliöjalka: " + place.calculatePricePerSquareFoot(cost) + " euroa/m²");
        System.out.println("Hinta per makuuhuone: " + place.calculatePricePerBedroom(cost) + " euroa/makuuhuone");
    }
}
