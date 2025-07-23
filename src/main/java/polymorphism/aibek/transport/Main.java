package polymorphism.aibek.transport;

public class Main {
    public static void main(String[] args) {
        Transport car =  new Car();
        car.move();
        Transport bike = new Bike();
        bike.move();
        Transport train = new Train();
        train.move();
    }
}
