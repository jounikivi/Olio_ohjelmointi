package kt10;

//Luokka Rectangle, joka toteuttaa Shape-rajapinnan
class Rectangle implements Shape {
 private double length; // Pituus
 private double width;  // Leveys

 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 @Override
 public double getArea() {
     return length * width; // laskee suorakulmion pinta-ala
 }
}
