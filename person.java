// This is a simple Java class named 'person'.
// Contains these Attributes:
// - name: String, int age, String gender

// Methods: Constructor, void displayInfo()

public class person {
    private String name;
    private int age;
    private String gender;

    // Constructor
    public person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = "Not specified"; // Default value
    }

    // Method to display information
    public void displayInfo() {
        System.out.println(gender + " " + name + ", Age: " + age);
    }

}
