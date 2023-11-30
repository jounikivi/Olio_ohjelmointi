package t9;

//Square-luokka, joka laajentaa Shape-luokkaa
class Square extends Shape {
 public Square(int size) {
     super(size);
 }

 // show-metodi toteutettu neliölle
 @Override
 public void show() {
     for (int i = 0; i < size; i++) {
         for (int j = 0; j < size; j++) {
             if (j == 0 || j == size - 1) {
                 System.out.print("| ");
             } else if (i == 0 || i == size - 1) {
                 System.out.print("- ");
             } else {
                 System.out.print("  ");
             }
         }
         System.out.println();
     }
 }
}