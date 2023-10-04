package kt4;

public class StudentDemo {
    public static void main(String[] args) {
        // Create instances of DetailedStudent
        DetailedStudent student1 = new DetailedStudent("John Doe", 12345, 3.0, 
        		Major.COMPUTER_SCIENCE, "123 Main St", "555-1234");
        DetailedStudent student2 = new DetailedStudent("Alice Smith", 54321, 3.5,
        		Major.BIOLOGY, "456 Elm St", "555-5678");

        // Use the getString method to get and print student information
        System.out.println("Student 1 Details:\n" + student1.getString() + "\n");
        System.out.println("Student 2 Details:\n" + student2.getString());
    }
}
