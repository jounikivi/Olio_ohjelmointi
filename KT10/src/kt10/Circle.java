package kt10;

//Luokka Circle, joka toteuttaa Shape-rajapinnan
class Circle implements Shape {
 private double radius; // Säde

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double getArea() {
     return Math.PI * radius * radius; // Laske ympyrän pinta-ala
 }
}
