package t9;

//Triangle-luokka, joka laajentaa Shape-luokkaa
class Triangle extends Shape {
 public Triangle(int size) {
     super(size);
 }

 // show-metodi toteutettu kolmiolle
 @Override
 public void show() {
     for (int i = 0; i < size; i++) {
         for (int j = 0; j < 2 * size - 1; j++) {
             if (i == size - 1 || i + j == size - 1 || j - i == size - 1) {
                 System.out.print("- ");
             } else {
                 System.out.print("  ");
             }
         }
         System.out.println();
     }
 }
}