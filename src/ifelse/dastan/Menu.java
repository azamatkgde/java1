package ifelse.dastan;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Калькуляторго өтүү");
        System.out.println("2 - Курстар тизмесин көрүү");
        System.out.println("3 - Чыгуу");
        System.out.print("Санды  жазыныз: ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Калькуляторго оттунуз");
                break;
            case 2:
                System.out.println("Курстардын тизмеси");
                break;
            case 3:
                System.out.println("Чыгып жатасыз!!!");
                break;
            default:
                System.out.println("Белгисиз буйрук.");
                break;
        }

        scanner.close();
    }
}


