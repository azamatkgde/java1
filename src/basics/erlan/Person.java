package basics.erlan;

public class Person {
    private String name;
    private int age;

    //  Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //  Геттер
    public String getName() { return name; }
    public int getAge() { return age; }

}
