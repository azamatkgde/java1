package oop.zhanna;

public class Cat {
    // Талаалар (Fields)
    String name;
    int age;

    // Методдор (Methods)
    void meow() {
        System.out.println(name + " meows!");
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
    }
}
