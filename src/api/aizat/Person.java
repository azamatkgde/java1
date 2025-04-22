package api.aizat;

public class Person {
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void print() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}
