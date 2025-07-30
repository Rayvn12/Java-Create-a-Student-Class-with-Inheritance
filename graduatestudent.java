// This is a simple Java class named 'graduatestudent'.
// Inherits from the 'student' class.

// Contains additional Attributes:
// String thesisTitle

// Methods: Constructor, void displayInfo() (overrides parent method)

public class graduatestudent extends student{
    // Additional attribute
    private String thesisTitle;

    // Constructor
    public graduatestudent(String name, int age, String studentId, String major, String thesisTitle) {
        // Call the parent class constructor
        super(name, age, studentId, major);
        this.thesisTitle = thesisTitle;
    }

    // Method to display information
    @Override
    // Overrides the displayInfo method from the student class
    public void displayInfo() {
        // Call the parent class method
        super.displayInfo();
        
        // Display graduate-specific information
        System.out.println("Thesis Title: " + thesisTitle);
    }
}
