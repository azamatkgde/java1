package abstractclass.Zhanna;

public class Car extends Vehicle {
    public Car(int speed, String color) {
        super(speed, color);
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started with roar!");
    }

    public void displayInfo() {
        System.out.println("Car color: " + color + ", speed: " + speed + " km/h");
    }
}
