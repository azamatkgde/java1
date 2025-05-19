package oop.zhanna.studentManagementSystem;
// Student class inherits from Person
public class Student extends Person {
    private int id; // Student-specific ID
    private String grade;// Grade (e.g., A, B, C)
    // Constructor with name, age, id, and grade
    public Student(String name, int age, int id, String grade) {
        super(name, age);// Call the parent constructor
        this.id = id;
        this.grade = grade;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    // Method to display full student info
    public void displayStudentInfo() {
        super.displayPersonInfo(); // Call parent display method
        System.out.println("ID: " + id + ", Grade: " + grade);
    }
}


