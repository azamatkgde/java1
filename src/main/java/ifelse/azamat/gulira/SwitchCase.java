package ifelse.azamat.gulira;

import  java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Аптанын кайсы күнү?

        System.out.println("1 ден 7 ге чейинки санды жазыңыз");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Дүйшөмбү");
                break;
            case 2:
                System.out.println("Шейшемби");
                break;
            case 3:
                System.out.println("Шаршемби");
                break;
            case 4:
                System.out.println("Бейшемби");
                break;
            case 5:
                System.out.println("Жума");
                break;
            case 6:
                System.out.println("Ишемби");
                break;
            case 7:
                System.out.println("Жекшемби");
                break;
            default:
                System.out.println("Аптада 7 эле күн бар");
        }
        // Меню

        System.out.println("Тандаңыз:");
        System.out.println("1 - Эсептөө");
        System.out.println("2 - Курстун тизмеси");
        System.out.println("3 - Чыгуу");
        System.out.println("Номер жазыңыз:");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("1 - Эсептөө");
                break;
            case 2:
                System.out.println("2 - Курстун тизмеси");
                break;
            case 3:
                System.out.println("3 - Чыгуу");
                break;
            default:
                System.out.println("!!!Ката");
        }
        scanner.close();
    }
}

