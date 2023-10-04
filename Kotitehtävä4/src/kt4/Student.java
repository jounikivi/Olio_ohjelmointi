package kt4;

//Student-luokan määrittely
public class Student {
 private String name;
 private int id;
 private double gpa;
 private Major major;

 // Konstruktori ilman GPA:ta ja Majoria
 public Student(String name, int id) {
     this.name = name;
     this.id = id;
     this.gpa = 0.0; // Oletuksena GPA on 0.0
     this.major = null; // Oletuksena ei ole majoria
 }

 // Konstruktori, joka ottaa GPA:n ja Majorin parametreina
 public Student(String name, int id, double gpa, Major major) {
     this.name = name;
     this.id = id;
     this.gpa = gpa;
     this.major = major;
 }

 // Metodi näyttää opiskelijan tiedot
 public void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("ID: " + id);
     System.out.println("GPA: " + gpa);
     System.out.println("Major: " + (major != null ? major.toString() : "Undeclared"));
 }

 public static void main(String[] args) {
     // Luo opiskelija ilman GPA:ta ja majoria
     Student student1 = new Student("John Doe", 12345);
     student1.displayInfo();

     System.out.println(); // Tyhjä rivi erottamaan tulosteet

     // Luo opiskelija GPA:lla ja majoreilla
     Student student2 = new Student("Alice Smith", 54321, 3.5, Major.COMPUTER_SCIENCE);
     student2.displayInfo();
 }
}
