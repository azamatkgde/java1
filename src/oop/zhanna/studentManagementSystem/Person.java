package oop.zhanna.studentManagementSystem;
// Base class for common properties like name and age
public class Person {
    private String name;// Encapsulated field
    private int age;
    // Constructor to initialize name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    // Method to display person info
    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
