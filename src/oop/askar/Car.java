package oop.askar;

public class Car {
    String brand;
    int speed;

    public Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void accelerate(int increase) {
        speed += increase;
        System.out.println(brand + " ускоряется. Теперь скорость: " + speed + " км/ч");
    }

    public void showInfo() {
        System.out.println("Автомобиль: " + brand + ", Скорость: " + speed + " км/ч");
    }
}