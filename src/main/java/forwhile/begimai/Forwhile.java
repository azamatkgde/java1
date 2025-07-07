package forwhile.begimai;

import java.util.Scanner;

public class Forwhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("obratnyi zikl");

        for (int i = 10; i >= 1; i--) {
            System.out.println(+i);


        }

        System.out.println("Gib zahl ein?");
        int a = scanner.nextInt();
        for (int c = 1; c <= 10; c++) {
            System.out.println(a + "*" + c + "=" + (a * c));

        }
        String input = "";

        while (!input.equals("exit")) {
            System.out.print("zahl ('exit'):");
            input = scanner.nextLine();
            System.out.print("Eingeben: " + input);
        }
        System.out.println("Ende");
        scanner.close();

    }
}


