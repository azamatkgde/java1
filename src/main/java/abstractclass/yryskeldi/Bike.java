package abstractclass.yryskeldi;

public class Bike extends Vehicle {

    public Bike(int speed, String color) {
        super(speed, color);
    }

    @Override
    public void startEngine() {
        System.out.println("Bike engine started silently!");
    }
}

