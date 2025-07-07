package forwhile.zhanna.dowhile;

import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Санды киргизиңиз (0 болсо цикл токтойт): ");
            number = scanner.nextInt();
            if (number != 0) {
                System.out.println("Киргизилген сан: " + number);
            }
        } while (number != 0);

        System.out.println("Цикл аяктады.");
        scanner.close();
    }
}
