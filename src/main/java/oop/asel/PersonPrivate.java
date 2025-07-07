package oop.asel;

public class PersonPrivate {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age>0 && age<150) {
            this.age = age;
        } else {
            System.out.println("Wrong input");
        }
    }
    public void sayHello() {
        System.out.println("Hi. My name is " + name + ". I'm " + age + " years old.");
    }
}
