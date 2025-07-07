package forwhile.azamat;

import java.util.Scanner;

public class RepeatUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Санды киргизиңиз (чыгыш үчүн 0): ");
            number = scanner.nextInt();
            if (number != 0) {
                System.out.println("Сиз киргизген сан: " + number);
            }
        } while (number != 0);

        System.out.println("Программа аяктады.");
        scanner.close();
    }
}