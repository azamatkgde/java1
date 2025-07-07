package ifelse.zhanna.switchcase;

import java.util.Scanner;

public class MenuSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Меню:");
        System.out.println("1 → Калькуляторго өтүү");
        System.out.println("2 → Курстар тизмесин көрүү");
        System.out.println("3 → Чыгуу");
        System.out.print("Тандоо жасаңыз: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> System.out.println("Калькуляторго өтүү");
            case 2 -> System.out.println("Курстар тизмесин көрүү");
            case 3 -> System.out.println("Чыгуу");
            default -> System.out.println("Белгисиз буйрук.");
        }

        scanner.close();
    }
}
