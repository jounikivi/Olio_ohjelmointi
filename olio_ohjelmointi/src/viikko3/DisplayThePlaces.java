package viikko3;

public class DisplayThePlaces {
    public static void main(String[] args) {
        // Luo PlaceToLive-instanssit suoraan koodissa
        PlaceToLive place1 = new PlaceToLive("Osoite 1", 2, 1000); // Esimerkkidatat
        PlaceToLive place2 = new PlaceToLive("Osoite 2", 3, 1500); // Esimerkkidatat

        // Syötä asumiskustannukset
        double costOfLiving = 2000.0; // Esimerkkidata

        // Näytä kustannukset
        double costPerSquareUnit1 = place1.calculateCostPerSquareUnit(costOfLiving);
        double costPerBedroom1 = place1.calculateCostPerBedroom(costOfLiving);

        double costPerSquareUnit2 = place2.calculateCostPerSquareUnit(costOfLiving);
        double costPerBedroom2 = place2.calculateCostPerBedroom(costOfLiving);

        System.out.println("Paikka 1: " + place1.getAddress());
        System.out.println("Kustannus neliöjalkaa (tai neliömetriä) kohden: $" + costPerSquareUnit1);
        System.out.println("Kustannus makuuhuonetta kohden: $" + costPerBedroom1);

        System.out.println("Paikka 2: " + place2.getAddress());
        System.out.println("Kustannus neliöjalkaa (tai neliömetriä) kohden: $" + costPerSquareUnit2);
        System.out.println("Kustannus makuuhuonetta kohden: $" + costPerBedroom2);
    }
}

