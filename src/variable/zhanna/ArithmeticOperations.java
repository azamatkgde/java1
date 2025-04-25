package variable.zhanna;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Колдонуучудан эки сан алабыз
        System.out.print("Биринчи санды киргизиңиз: ");
        int a = scanner.nextInt();

        System.out.print("Экинчи санды киргизиңиз: ");
        int b = scanner.nextInt();

        // Арифметикалык операциялар
        int sum = a + b;
        int diff = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        // Натыйжаларды чыгарабыз
        System.out.println("\n--- Натыйжалар ---");
        System.out.println("Кошуу (a + b) = " + sum);
        System.out.println("Кемитүү (a - b) = " + diff);
        System.out.println("Көбөйтүү (a * b) = " + product);
        System.out.println("Бөлүү (a / b) = " + quotient);
        System.out.println("Калдык (a % b) =" + remainder);
    }
}
