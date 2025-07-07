package ifelse.turat;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // 3-тапшырманы дагы да кызыктуу кылып жасоо

        do {
            System.out.println("\n--- Башкы Меню ---");
            System.out.println("1 - Калькуляторго өтүү");
            System.out.println("2 - Курстар тизмесин көрүү");
            System.out.println("3 - Чыгуу");
            System.out.print("Тандооңузду киргизиңиз: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    runCalculator(scanner);
                    break;
                case 2:
                    showCourses();
                    break;
                case 3:
                    System.out.println("Программа жабылып жатат. Кош болуңуз!");
                    break;
                default:
                    System.out.println("Белгисиз буйрук. Сураныч, 1ден 3кө чейинки сан киргизиңиз.");
            }
        } while (choice != 3);

        scanner.close();
    }

    public static void runCalculator(Scanner scanner) {
        System.out.println("\n-- Калькулятор --");

        System.out.print("Биринчи санды киргизиңиз: ");
        double num1 = scanner.nextDouble();

        System.out.print("Экинчи санды киргизиңиз: ");
        double num2 = scanner.nextDouble();

        System.out.println("Амалды тандаңыз: (+, -, *, /)");
        char operation = scanner.next().charAt(0);

        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Жыйынтык: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Жыйынтык: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Жыйынтык: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Жыйынтык: " + result);
                } else {
                    System.out.println("Нөлгө бөлүүгө болбойт!");
                }
                break;
            default:
                System.out.println("Туура эмес амал тандалды.");
                break;
        }
        System.out.println("Башкы менюга кайтып жатасыз...");
    }

    public static void showCourses() {
        System.out.println("\n-- Курстар тизмеси --");
        System.out.println("1. Java");
        System.out.println("2. Flutter");
        System.out.println("3. Frontend (HTML, CSS, JS)");
        System.out.println("Башкы менюга кайтып жатасыз...");
    }
}
