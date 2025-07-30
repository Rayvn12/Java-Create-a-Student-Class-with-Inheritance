// This is a simple Java class named 'student'.
// Inherits from the 'student' class.

// Contains additional Attributes:
// int year (e.g., Freshman, Sophomore, etc.)

// Methods: Constructor, void displayInfo() (overrides parent method)

public class undergraduatestudent extends student{
    // Additional attribute
    private int year;

    // Constructor
    public undergraduatestudent(String name, int age, String studentId, String major, int year) {
        // Call the parent class constructor
        super(name, age, studentId, major);
        this.year = year;
    }

    // Method to display information
    @Override

    // Overrides the displayInfo method from the student class
    public void displayInfo() {
        // Call the parent class method
        super.displayInfo();

        // Display undergraduate-specific information
        System.out.println("Year: " + year);
    }

}
