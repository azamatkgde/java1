package ifelse.nursultan;

import java.util.Scanner;

public class ConditionalConstructs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Бугунку аба ырыйын жазыныз");
        int temperature = scanner.nextInt();

        if (temperature >= 30) {
            System.out.println("Аба ыссык. Жеңил кийим кииңиз.");
        } else if (temperature >= 0) {
            System.out.println("Кадимки кийим кииңиз");
        } else {
            System.out.println("Аба суук. Жылуу кийим кииңиз");
        }
        System.out.println(" ");

        System.out.println("Бугун канча балл алдын?");
        int score = scanner.nextInt();

        if (score > 100 || score < 0) {
            System.out.println("Мындай балл жок!!");
        } else if (score >= 90) {
            System.out.println("5");
        } else if (score >= 70) {
            System.out.println("4");
        } else if (score >= 50) {
            System.out.println("3");
        } else {
            System.out.println("2");
        }

        System.out.println(" ");

        System.out.println("Бирден жетиге чейин сан жазыныз");
        int dayOfTheWeek = scanner.nextInt();

        switch (dayOfTheWeek) {
            case 1:
                System.out.println("Бугун дуйшомбу");
                break;
            case 2:
                System.out.println("Бугун шейшемби");
                break;
            case 3:
                System.out.println("Бугун шаршемби");
                break;
            case 4:
                System.out.println("Бугун жекшемби");
                break;
            case 5:
                System.out.println("Бугун жума");
                break;
            case 6:
                System.out.println("Бугун ишемби");
                break;
            case 7:
                System.out.println("Бугун жекшемби");
                break;
            default:
                System.out.println("Мындай кун жок");
                break;
        }

        System.out.println(" ");

        System.out.println("Меню танданыз");
        System.out.println("1: Калькулаторго отуу");
        System.out.println("2: Курстар тизмесин коруу");
        System.out.println("3: Чыгуу");
        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Калькулаторго өттүнүз.");

                System.out.println("Биринчи сан жазыныз");
                double num = scanner.nextInt();

                System.out.println("Операция танданыз: +,-,*,/,%");
                char operation = scanner.next().charAt(0);

                System.out.println("Экинчи сан жазыныз");
                double num2 = scanner.nextInt();

                switch (operation) {
                    case '+':
                        System.out.println("Жооп: " + (num + num2));
                        break;
                    case '-':
                        System.out.println("Жооп: " + (num - num2));
                        break;
                    case '*':
                        System.out.println("Жооп: " + (num * num2));
                        break;
                    case '/':
                        if (num2 != 0) {
                            System.out.println("Жооп: " + (num / num2));
                        } else {
                            System.out.println("0го болууго болбойт!");
                        }
                        break;
                    case '%':
                        if (num2 != 0) {
                            System.out.println("Жооп: " + (num % num2));
                        } else {
                            System.out.println("0го болууго болбойт!");
                        }
                        break;
                    default:
                        System.out.println("Мындай операция жок.");
                        break;
                }
                break;
            case 2:
                System.out.println("Курстар тизмеси:");
                System.out.println("- Java");
                System.out.println("- JavaScript");
                System.out.println("- Python");
                System.out.println("- PHP");
                System.out.println("- Node.js");
                System.out.println("- C#");
                break;
            case 3:
                System.out.println("Сиз ийгиликтуу чыктыныз");
                scanner.close();
                return;
            default:
                System.out.println("Мындай меню жок");
                break;
        }
    }
}
