package variable.azamat;

import java.util.Scanner;  // Scanner классын импорттоо

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner объектисин түзүү

        // Колдонуучудан сандарды суроо
        System.out.print("Биринчи санды киргизиңиз: ");
        double num1 = scanner.nextDouble();

        System.out.print("Экинчи санды киргизиңиз: ");
        double num2 = scanner.nextDouble();

        // Арифметикалык операцияларды аткаруу
        System.out.println("\nОперациялардын жыйынтыгы:");
        System.out.println("Кошуу: " + (num1 + num2));
        System.out.println("Алып салуу: " + (num1 - num2));
        System.out.println("Көбөйтүү: " + (num1 * num2));

        // Нөлгө бөлүүнү текшерүү
        if (num2 != 0) {
            System.out.println("Бөлүү: " + (num1 / num2));
            System.out.println("Калдык: " + (num1 % num2));
        } else {
            System.out.println("Бөлүү мүмкүн эмес (нөлгө бөлүүгө болбойт)!");
        }

        scanner.close(); // Scanner'ди жабуу
    }
}