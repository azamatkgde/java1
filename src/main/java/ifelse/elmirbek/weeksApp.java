package ifelse.elmirbek;

import java.util.Scanner;

public class weeksApp {

    public static void main(String[] args) {

        // choice week

        // Monday
        // Tuesday
        // Wednesday
        // Thursday
        // Friday
        // Saturday
        // Sunday

        // Дүйшөмбү
        // Шейшемби
        // Шаршемби
        // Бейшемби
        // Жума
        // Ишемби
        // Жекшемби

        Scanner scanner = new Scanner(System.in);
        System.out.println("Кундордун ар кандай тилде которулушу боюнча программа ");
        System.out.println("Кунду танданыз сураныч : ");
        int week = scanner.nextInt();
        switch (week){
            case 1:
                System.out.println("1 - Понедельник(ru) - Дуйшомбу(kg) - Monday(en)");
                break;
            case 2:
                System.out.println("2 - Вторник(ru) - Шейшемби(kg) - Tuesday(en)");
                break;
            case 3:
                System.out.println("3 - Среда(ru) - Шаршемби(kg) - Wednesday(en)");
                break;
            case 4:
                System.out.println("4 - Четверг(ru) - Бейшенби(kg) - Friday(en)");
                break;
            case 5:
                System.out.println("5 - Пятница(ru) - Жума(kg) - Saturday(en)");
                break;
            case 6:
                System.out.println("6 - Суббота(ru) - Ишемби(kg) - Saturday(en)");
                break;
            case 7:
                System.out.println("7 - Воскерсенье - Жекшемби(kg) - Sunday(en)");
                break;
            default:
                System.out.println("Мындай кун жок");
                break;
        }
    }
}
