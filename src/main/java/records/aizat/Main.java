package records.aizat;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 2025, false);
        Car car2 = new Car("Toyota", 2017, true);

        System.out.println("Car 1: " + car);
        System.out.println("Car 2: " + car2);

        if (car.equals(car2)) {
            System.out.println("Экөөнүн баары бирдей");
        } else {
            System.out.println("Унаалар ар башка");
        }
    }
}
