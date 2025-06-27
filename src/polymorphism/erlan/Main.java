package polymorphism.erlan;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car();
        Transport bike = new Bike();
        Transport train = new Train();

        car.move();   // Car specific move()
        bike.move();  // Bike specific move()
        train.move(); // Train specific move()
    }
}
