package ifelse.aelita;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нетное число");
        }

    }
}

