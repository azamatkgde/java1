package abstractclass.yryskeldi;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car(120, "Кызыл");
        Vehicle bike = new Bike(80, "Кара");

        car.startEngine(); // Car engine started with roar!
        car.stop();        // Транспорт токтоду

        bike.startEngine(); // Bike engine started silently!
        bike.stop();        // Транспорт токтоду
    }
}

