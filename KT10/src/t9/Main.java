package t9;

//Main-luokka, jossa toiminnallisuus demonstroidaan
public class Main {
 public static void main(String[] args) {
     Shape square = new Square(5); // Luodaan neliö, koko 5
     Shape triangle = new Triangle(5); // Luodaan kolmio, koko 5

     System.out.println("Square:");
     square.show(); // Näytetään neliö
     System.out.println("\nTriangle:");
     triangle.show(); // Näytetään kolmio
 }
}