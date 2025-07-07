package oop.yryskeldi;

public class Main {
    public static void main(String[] args) {

        // Жөнөкөй унаалар массиви
        Car[] regularCars = {
                new Car("Mers", 2025),
                new Car("BMW", 2025),
                new Car("Honda", 2025),
                new Car("KIA", 2025),
                new Car("Hundai", 2025),
                new Car("Lexus", 2025),
                new Car("Mazda", 2025)
        };

        // Спорт унаалар массиви
        SportCar[] sportCars = {
                new SportCar("Ferrari", 2023, 350),
                new SportCar("Lamborghini", 2024, 340)
        };

        // Жөнөкөй машиналарды чыгаруу
        System.out.println("=== Жөнөкөй машиналар ===");
        for (Car car : regularCars) {
            car.showInfo();
        }

        // Спорт машиналарды чыгаруу
        System.out.println("\n=== Спорт машиналар ===");
        for (SportCar sport : sportCars) {
            sport.showInfo();
        }
    }
}
