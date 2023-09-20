package viikko2;

public class FoodProductTesti {
    public static void main(String[] args) {
        FoodProduct hedelma = new FoodProduct("Hedelmät", 100, 2.50, 5, 100);
        FoodProduct leivonnaiset = new FoodProduct("Leivonnaiset", 200, 5.00, 10, 250);
        
        System.out.println("Tiedot hedelmistä:");
        hedelma.displayInfo();
        
        System.out.println("\nTiedot leivonnaisista:");
        leivonnaiset.displayInfo();
        }
}

