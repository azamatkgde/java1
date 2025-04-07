package forwhile.aelita;

import java.util.Scanner;

public class Forwhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("Таблица: ");
        int b = scanner.nextInt();
        for (int c = 1; c <= 10; c++) {
            System.out.println(b + "*" + c + "=" + (b * c));
        }
    }
}

