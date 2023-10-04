package kt4;

import java.time.LocalTime;
//AirplaneFlight-luokka
public class AirplaneFlight {
 private int flightNumber;
 private Airport departureAirport;
 private LocalTime departureTime;
 private Airport arrivalAirport;
 private LocalTime arrivalTime;

 // Konstruktori ilman aikatietoja
 public AirplaneFlight(int flightNumber, Airport departureAirport, Airport arrivalAirport) {
     this.flightNumber = flightNumber;
     this.departureAirport = departureAirport;
     this.arrivalAirport = arrivalAirport;
     this.departureTime = null; // Oletuksena ei ole aikatietoja
     this.arrivalTime = null;
 }

 // Konstruktori, joka ottaa aikatiedot parametreina
 public AirplaneFlight(int flightNumber, Airport departureAirport, LocalTime departureTime,
                       Airport arrivalAirport, LocalTime arrivalTime) {
     this.flightNumber = flightNumber;
     this.departureAirport = departureAirport;
     this.departureTime = departureTime;
     this.arrivalAirport = arrivalAirport;
     this.arrivalTime = arrivalTime;
 }

 
 // Metodi laskee lennon keston

public int duration() {
  if (departureTime == null || arrivalTime == null) {
      return 0; // Jos aikatiedot puuttuvat, palautetaan 0
  }

  int departureMinutes = departureTime.getHour() * 60 + departureTime.getMinute();
  int arrivalMinutes = arrivalTime.getHour() * 60 + arrivalTime.getMinute();

  return arrivalMinutes - departureMinutes;
}

 // Metodi näyttää lentotiedot
 public void displayInfo() {
     System.out.println("Flight Number: " + flightNumber);
     System.out.println("Departure Airport: " + departureAirport);
     System.out.println("Departure Time: " + (departureTime != null ? departureTime.toString() : "N/A"));
     System.out.println("Arrival Airport: " + arrivalAirport);
     System.out.println("Arrival Time: " + (arrivalTime != null ? arrivalTime.toString() : "N/A"));
 }

 public static void main(String[] args) {
     // Luo lentotiedot ilman aikatietoja
     AirplaneFlight flight1 = new AirplaneFlight(123, Airport.HEL, Airport.TMP);
     flight1.displayInfo();
     System.out.println("Duration: " + flight1.duration() + " minutes");

     System.out.println(); // Tyhjä rivi erottamaan tulosteet

     // Luo lentotiedot aikatiedoilla
     LocalTime departureTime = LocalTime.of(10, 0);
     LocalTime arrivalTime = LocalTime.of(12, 30);
     AirplaneFlight flight2 = new AirplaneFlight(456, Airport.JYV, departureTime, Airport.TKU, arrivalTime);
     flight2.displayInfo();
     System.out.println("Duration: " + flight2.duration() + " minutes");
 }
}
