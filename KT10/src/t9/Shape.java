package t9;

//Shape-luokka
abstract class Shape {
 protected int size; // Koko

 public Shape(int size) {
     this.size = size;
 }

 // Abstrakti metodi show, joka täytyy toteuttaa aliluokissa
 public abstract void show();
}