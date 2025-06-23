package abstractclass.Zhanna;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(150, "Red");
        Bike bike = new Bike(80, "Black");

        System.out.println("Car color: " + car.getColor());
        System.out.println("Car speed: " + car.getSpeed() + " km/h");
        car.startEngine();
        car.stop();

        bike.startEngine();
        bike.stop();
    }
}