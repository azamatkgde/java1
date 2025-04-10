package basics.azamat.omka;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SaleOfCars[] cars = {
                new SaleOfCars("Toyota", "Camry", 50),
                new SaleOfCars("BMW", "X5", 100),
                new SaleOfCars("Honda", "Accord", 45),
                new SaleOfCars("BMW", "E-Class", 120),
                new SaleOfCars("Mercedes", "X5", 56),
                new SaleOfCars("Audi", "A6", 104),
                new SaleOfCars("Volkswagen", "E-Class", 96),
                new SaleOfCars("Skoda", "Superb", 78),
                new SaleOfCars("Lada", "Vesta", 65),
                new SaleOfCars("UAZ", "Patriot", 56),
                new SaleOfCars("GAZ", "Volga", 45),
                new SaleOfCars("Hyundai", "Sonata", 23),
                new SaleOfCars("Kia", "Optima", 85),
                new SaleOfCars("Nissan", "Altima", 89),
                new SaleOfCars("Mitsubishi", "Outlander", 78),
        };

        while (true) {
            System.out.println(" Биздин машина аренда сервисине кош келиңиз!");
            System.out.println("1. Машиналар");
            System.out.println("2. Машина арендага алуу");
            System.out.println("3. Машина кайтаруу");
            System.out.println("4. Чыгуу");
            System.out.print("Тандаңыз: ");

            int choice = scanner.nextInt();
            if (choice == 4) {
                System.out.println("Программа жабылды!");
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println(" Биздеги машиналар:");
                    for (int i = 0; i < cars.length; i++) {
                        System.out.print((i + 1) + ". ");
                        cars[i].displayInfo();
                    }
                    break;
                case 2:
                    System.out.print("Кайсы машинаны арендага алгыңыз келет? (№): ");
                    int rentChoice = scanner.nextInt();
                    if (rentChoice > 0 && rentChoice <= cars.length) {
                        cars[rentChoice - 1].rent();
                    } else {
                        System.out.println("Туура эмес тандадыңыз!!");
                    }
                    break;
                case 3:
                    System.out.print("Кайсы машинаны кайтаргыңыз келет? (№): ");
                    int returnChoice = scanner.nextInt();
                    if (returnChoice > 0 && returnChoice <= cars.length) {
                        cars[returnChoice - 1].returnCars();
                    } else {
                        System.out.println("Туура эмес тандадыңыз!");
                    }
                    break;
                default:
                    System.out.println("Туура эмес тандадыңыз! Кайра туура сан бериңиз.");
            }
        }
        scanner.close();
    }
}


