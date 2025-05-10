package forwhile.dastan;

import java.util.Scanner;

public class DoWhileTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Циклдер:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("Сырткы цикл i = " + i + " --- Ички цикл j = " + j);
            }
        }

        scanner.close();

    }
}
