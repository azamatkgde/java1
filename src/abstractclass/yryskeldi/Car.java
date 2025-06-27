package abstractclass.yryskeldi;

public class Car extends Vehicle {

    public Car(int speed, String color) {
        super(speed, color);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started with roar!");
    }
}

