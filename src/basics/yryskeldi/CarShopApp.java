package basics.yryskeldi;

import java.util.Scanner;

public class CarShopApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[10]; // Унаалар тизмеси
        Car[] orders = new Car[10]; // Заказ тизмеси
        int carCount = 0;
        int orderCount = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n=== Унаа Дүкөнү ===");
            System.out.println("1. Унаа кошуу");
            System.out.println("2. Бардык унааларды көрүү");
            System.out.println("3. Унаа заказ кылуу");
            System.out.println("4. Менин заказдарым");
            System.out.println("5. Чыгуу");
            System.out.print("Тандооңуз: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                if (carCount < cars.length) {
                    System.out.print("Моделин жазыңыз: ");
                    String model = scanner.nextLine();

                    System.out.print("Отун түрүн жазыңыз (мисалы: бензин, дизель, электр): ");
                    String fuelType = scanner.nextLine();

                    cars[carCount] = new Car(model, fuelType);
                    carCount++;
                    System.out.println("✅ Унаа кошулду!");
                } else {
                    System.out.println("⚠ Дүкөн толду.");
                }

            } else if (choice == 2) {
                if (carCount == 0) {
                    System.out.println("🚫 Унаа кошулган эмес.");
                } else {
                    System.out.println("\n=== Бардык Унаалар ===");
                    for (int i = 0; i < carCount; i++) {
                        System.out.println((i + 1) + ")");
                        cars[i].printInfo();
                        System.out.println("------------");
                    }
                }

            } else if (choice == 3) {
                if (carCount == 0) {
                    System.out.println("Эч кандай унаа жок. Адегенде унаа кошуңуз.");
                    continue;
                }
                System.out.println("\nУнаанын номерин тандаңыз (1 - " + carCount + "): ");
                int carNumber = scanner.nextInt();
                scanner.nextLine();

                if (carNumber > 0 && carNumber <= carCount) {
                    if (orderCount < orders.length) {
                        orders[orderCount] = cars[carNumber - 1];
                        orderCount++;
                        System.out.println("✅ Заказ ийгиликтүү кошулду!");
                    } else {
                        System.out.println("⚠ Заказ тизмеси толду.");
                    }
                } else {
                    System.out.println("❌ Туура эмес номер.");
                }

            } else if (choice == 4) {
                if (orderCount == 0) {
                    System.out.println("🚫 Сизде заказ жок.");
                } else {
                    System.out.println("\n=== Менин Заказдарым ===");
                    for (int i = 0; i < orderCount; i++) {
                        System.out.println((i + 1) + ")");
                        orders[i].printInfo();
                        System.out.println("------------");
                    }
                }

            } else if (choice == 5) {
                System.out.println("🔚 Программа жабылды.");
                running = false;

            } else {
                System.out.println("❌ Туура эмес тандоо!");
            }
        }

        scanner.close();
    }
}
