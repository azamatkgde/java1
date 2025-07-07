package polymorphism.aizat;

public class Main {
    public static void main (String[] args){
        Transport car = new Car();
        Transport bike = new Bike();
        Transport train = new Train();

        car.move();
        bike.move();
        train.move();

    }
}
