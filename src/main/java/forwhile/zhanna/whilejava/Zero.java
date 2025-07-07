package forwhile.zhanna.whilejava;

import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Санды киргизиңиз (0 болсо цикл токтойт): ");
        number = scanner.nextInt();

        while (number != 0) {
            System.out.println("Киргизилген сан: " + number);
            System.out.print("Санды киргизиңиз (0 болсо цикл токтойт): ");
            number = scanner.nextInt();
        }

        System.out.println("Цикл аяктады.");
        scanner.close();
    }
}
