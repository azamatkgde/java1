package ifelse.turat;

import java.util.Scanner;

public class MenuSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // 3-тапшырма, бирок мага көп кызыктуу болгон жок

        System.out.println("Меню:");
        System.out.println("1 - Калькуляторго өтүү");
        System.out.println("2 - Курстар тизмесин көрүү");
        System.out.println("3 - Чыгуу");
        System.out.print("Тандооңузду киргизиңиз: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Калькуляторго өтүп жатасыз...");
                break;
            case 2:
                System.out.println("Курстар тизмеси:");
                // Бул жерге курстарды кошсо болот
                break;
            case 3:
                System.out.println("Программадан чыгып жатасыз...");
                break;
            default:
                System.out.println("Белгисиз буйрук.");
                break;
        }

        scanner.close();
    }
}
