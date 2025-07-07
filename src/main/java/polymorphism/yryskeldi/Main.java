package polymorphism.yryskeldi;

public class Main {
    public static void main(String[] args) {
        Transport car = new Car("Toyota", 120);
        Transport bike = new Bike("Yamaha", 90);
        Transport train = new Train("ICE Train", 300);

        Transport[] transports = {car, bike, train};

        for (Transport t : transports) {
            t.info();
            t.move();
            System.out.println();
        }
    }
}

