package oop.yryskeldi;

public class Car {
    private String name;
    private int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public void showInfo() {
        System.out.println("Машина аты: " + name + ", Чыккан жылы: " + year);
    }
}
