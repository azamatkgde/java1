package forwhile.turat;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Сан жазыңыз (0 болсо токтойт): ");
            number = scanner.nextInt();
            if (number != 0) {
                System.out.println("Сиз жазган сан: " + number);
            }
        } while (number != 0);

        System.out.println("Цикл токтоду. Сиз 0 санын жаздыңыз.");
    }
}
