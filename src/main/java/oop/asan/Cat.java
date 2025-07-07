package oop.asan;

public class Cat {
    private String light;
    private String type;
    private int age;
    private double weight;

    //Конструктор
    public Cat(String light, String type, int age, double weight) {
        this.light = light;
        this.type = type;
        this.age = age;
        this.weight = weight;

    }

    public String getLight() {
        return light;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void catOrigins() {
        System.out.println(type + " мышыгы орточо " + age + " жыл жашайт " + " салмагы " + weight);
    }

}



