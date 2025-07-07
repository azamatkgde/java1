package forwhile.meerim;

import java.util.Scanner;

public class ForClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Обратный отсчет
        System.out.println("Countdown:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }

        System.out.println();

        // 2. Цикл do-while: пока пользователь не введет 0
        System.out.println("WhileClass:");
        int number;
        do {
            System.out.print("Please, enter your number (0 to exit): ");
            number = scanner.nextInt();
            System.out.println("You entered: " + number);
        } while (number != 0);
        System.out.println("Exit");

        System.out.println();

        // 3. Таблица умножения
        System.out.println("Table:");
        System.out.print("Enter a number for multiplication table: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        System.out.println();

        // 4. Вложенные циклы
        System.out.println("Nested for-loop:");
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("(" + i + "," + j + ")");
            }
        }

        scanner.close();
    }
}