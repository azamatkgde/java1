package oop.aizat.aizatkonst2;

public class Animal {
    private String name;

    // Конструктор
    public Animal (String name) {
        this.name = name;
    }

    // Геттер - маалымат алуу үчүн
    public String getName() {
        return name;
    }

    public void printAnimalInfo() {
        System.out.println("Name: " + name);
    }
}
