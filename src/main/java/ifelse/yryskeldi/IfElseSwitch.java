package ifelse.yryskeldi;
import java.util.Scanner;

public class IfElseSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Температура боюнча кийим тандоо
        System.out.print("Температураны киргизиңиз: ");
        int temperature = scanner.nextInt();

        if (temperature > 30) {
            System.out.println("Аба ыссык. Жеңил кийим кииңиз.");
        } else if (temperature >= 0) {
            System.out.println("Кадимки кийим кииңиз.");
        } else {
            System.out.println("Аба суук. Жылуу кийим кииңиз.");
        }

        // Баалоо системасы1
        System.out.print("Баллды киргизиңиз (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Сиздин бааңыз: 5");
        } else if (score >= 70 && score <= 89) {
            System.out.println("Сиздин бааңыз: 4");
        } else if (score >= 50 && score <= 69) {
            System.out.println("Сиздин бааңыз: 3");
        } else if (score >= 0 && score <= 49) {
            System.out.println("Сиздин бааңыз: 2");
        } else {
            System.out.println("Туура эмес балл! 0 менен 100дүн ортосунда сан киргизиңиз.");
        }


        //Жуманын кундору
        System.out.print("Жуманын күнү катары санды киргизиңиз (1–7): ");
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
                System.out.println("Мындай күн жок.");
        }


        //Меню
        System.out.println("Меню:");
        System.out.println("1 → Калькуляторго өтүү");
        System.out.println("2 → Курстар тизмесин көрүү");
        System.out.println("3 → Чыгуу");
        System.out.print("Тандооңузду киргизиңиз: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Калькуляторго өтүү");
                break;
            case 2:
                System.out.println("Курстар тизмесин көрүү");
                break;
            case 3:
                System.out.println("Чыгуу");
                break;
            default:
                System.out.println("Белгисиз буйрук.");
        }

        scanner.close();
    }
}
