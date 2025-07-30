// This is a simple Java class named 'student'.
// Inherits from the 'person' class.

// Contains additional Attributes:
// String studentId, String major

// Methods: Constructor, void displayInfo() (overrides parent method)

public class student extends person {
    // Attributes
    public String studentId;
    public String major;

    // Constructor
    public student(String name, int age, String studentId, String major) {
        // Call the parent class constructor
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }

    // Method to display information
    @Override

    // Overrides the displayInfo method from the person class
    public void displayInfo() {
        // Call the parent class method
        super.displayInfo();
        // Display student-specific information
        System.out.println("Student ID: " + studentId + ", Major: " + major);
    }

}
