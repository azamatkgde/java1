package oop.yryskeldi;

public class SportCar extends Car {
    private int maxSpeed;

    public SportCar(String name, int year, int maxSpeed) {
        super(name, year);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Максималдуу ылдамдык: " + maxSpeed + " км/с");
    }
}
