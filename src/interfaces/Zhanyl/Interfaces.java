package interfaces.Zhanyl;

import java.util.Scanner;

public class Interfaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Транспорт тандаңыз:");
        System.out.println("1 - Машина");
        System.out.println("2 - Учак");
        System.out.println("3 - Кеме");
        System.out.print("Тандооңуз: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                Car car = new Car();
                car.drive();
                break;
            case 2:
                Airplane airplane = new Airplane();
                airplane.drive();
                airplane.fly();
                break;
            case 3:
                Boat boat = new Boat();
                boat.sail();
                break;
            default:
                System.out.println("Мындай транспорт жок!");
        }

        scanner.close();
    }
}
