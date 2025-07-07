package ifelse.zhanna.switchcase;

import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1ден 7ге чейинки санды киргизиңиз: ");
        int day = scanner.nextInt();

       /* switch (day) {
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
                System.out.println("Мындай күн жок.");
        }

        scanner.close();*/
        switch (day) {
            case 1 -> System.out.println("Дүйшөмбү");
            case 2 -> System.out.println("Шейшемби");
            case 3 -> System.out.println("Шаршемби");
            case 4 -> System.out.println("Бейшемби");
            case 5 -> System.out.println("Жума");
            case 6 -> System.out.println("Ишемби");
            case 7 -> System.out.println("Жекшемби");
            default -> System.out.println("Мындай күн жок.");
        }
    }
}
