package kt10;

//Luokka Triangle, joka toteuttaa Shape-rajapinnan
class Triangle implements Shape {
 private double base;   // Kanta
 private double height; // Korkeus

 public Triangle(double base, double height) {
     this.base = base;
     this.height = height;
 }

 @Override
 public double getArea() {
     return 0.5 * base * height; // Laske kolmion pinta-ala
 }
}
