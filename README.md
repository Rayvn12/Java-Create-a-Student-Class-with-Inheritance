# Java Inheritance: Student Class Project

This project demonstrates the use of **inheritance** in Java by modeling a simple academic hierarchy. It includes a base `Person` class and several subclasses to represent different types of students.

## 📚 Project Structure

- **Person.java** – Base class with common attributes like `name`, `age`, and `gender`.
- **Student.java** – Inherits from `Person` and adds `studentId` and `major`.
- **UndergraduateStudent.java** – Extends `Student` and includes a `year` (e.g., freshman, sophomore).
- **GraduateStudent.java** – Extends `Student` and includes a `thesisTitle`.
- **Main.java** – Demonstrates polymorphism and displays student information using overridden `displayInfo()` methods.

## 🧠 Concepts Covered

- Object-Oriented Programming (OOP)
- Class Inheritance
- Constructor Chaining
- Method Overriding
- Polymorphism

## ▶️ How to Run

1. Compile all `.java` files:
   ```bash
   javac *.java
