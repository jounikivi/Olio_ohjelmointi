package kt10;

//Main-luokka toiminnallisuuden esittämiseen
public class Main3 {
 public static void main(String[] args) {
     Shape rectangle = new Rectangle(5, 10);
     Shape circle = new Circle(7);
     Shape triangle = new Triangle(4, 6);

     System.out.println("Suorakulmion pinta-ala: " + rectangle.getArea());
     System.out.println("Ympyrän pinta-ala: " + circle.getArea());
     System.out.println("Kolmion pinta-ala: " + triangle.getArea());
 }
}
