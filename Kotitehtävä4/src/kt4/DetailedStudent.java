package kt4;

public class DetailedStudent extends Student {
    // Additional attributes specific to DetailedStudent
    private String address;
    private String phoneNumber;

    // Constructor for DetailedStudent
    public DetailedStudent(String name, int id, 
    		double gpa, Major major, String address, String phoneNumber) {
        super(name, id, gpa, major);
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Overridden getString method to include additional details
    public String getString() {
        String studentInfo = super.toString(); // Get basic student info from the superclass
        String detailedInfo = "Address: " + address + "\n" +
                             "Phone Number: " + phoneNumber;
        return studentInfo + "\n" + detailedInfo;
    }
}
