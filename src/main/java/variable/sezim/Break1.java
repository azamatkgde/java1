package variable.sezim;

import java.util.Scanner;

public class Break1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Выберите Меню:\n" +
                "1 - Калькулятор \n" +
                "2 - Курстар \n" +
                "3 - Выход \n");
        int choice = s.nextInt();

        switch (choice){
            case 1:
                System.out.println("Калькуляторго отуу");
                break;
            case 2:
                System.out.println("Курстар тизмеси");
                break;
            case 3:
                System.out.println(" Выход ");
                break;
            default:
                System.out.println("Неправильный выбор");

        }

    }
}
