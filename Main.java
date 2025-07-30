public class Main {
    public static void main(String[] args) {
        // Create an undergraduate student
        undergraduatestudent undergrad = new undergraduatestudent("Alice", 20, "U12345", "Computer Science", 2);
        undergrad.displayInfo();

        // Create a graduate student
        graduatestudent grad = new graduatestudent("Bob", 24, "G67890", "Data Science", "Machine Learning Algorithms");
        grad.displayInfo();
    }
    
}
