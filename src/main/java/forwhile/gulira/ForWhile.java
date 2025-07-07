package forwhile.gulira;

import java.util.Scanner;

public class ForWhile {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println("Сан: " + i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!"exit".equals(input)) {
            System.out.print("Сөз жаз (чыгыш үчүн 'exit'): ");
            input = scanner.nextLine();
            System.out.println("Cиз " + input + " деп жаздыңыз");
        }

        System.out.println("Программа аяктады");

        scanner.close();
    }
}
