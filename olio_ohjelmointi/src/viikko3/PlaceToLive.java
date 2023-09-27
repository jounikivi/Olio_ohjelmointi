package viikko3;

public class PlaceToLive {
    private String address;
    private int numberOfBedrooms;
    private double area;

    // Konstruktori
    public PlaceToLive(String address, int numberOfBedrooms, double area) {
        this.address = address;
        this.numberOfBedrooms = numberOfBedrooms;
        this.area = area;
    }

    // Metodi hinnan laskemiseksi neliöjalkaa (tai neliömetriä) kohden
    public double calculateCostPerSquareUnit(double costOfLiving) {
        return costOfLiving / area;
    }

    // Metodi hinnan laskemiseksi makuuhuonetta kohden
    public double calculateCostPerBedroom(double costOfLiving) {
        return costOfLiving / numberOfBedrooms;
    }

    // Getterit
    public String getAddress() {
        return address;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public double getArea() {
        return area;
    }
}

