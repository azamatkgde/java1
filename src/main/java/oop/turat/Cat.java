package oop.turat;

public class Cat {
    // Талаалар (fields)
    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Методдор
    public void meow() {
        System.out.println(name + " мыёлойт!");
    }

    public void showInfo() {
        System.out.println("Мышыктын аты: " + name + ", Жашы: " + age);
    }
}
