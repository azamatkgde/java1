package variable.Kunduz;

import java.util.Scanner;

public class CreditApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Имя");
        String name = sc.nextLine();
        System.out.println("Фамилия");
        String фамилия  = sc.nextLine();
        System.out.println(" Возраст");
        int age = sc.nextInt();
        System.out.println("Сумма");
        double sum = sc.nextDouble();
        System.out.println("Срок");
        int month = sc.nextInt();
        System.out.println("Salary");
        double salary = sc.nextDouble();
        System.out.println("Цель");
        String purpose = sc.nextLine();
        sc.nextLine();
        System.out.println("Другие кредиты? (false, true)");
        boolean isCredit = sc.nextBoolean();
        System.out.println("Контакт");
        String number = sc.nextLine();
        sc.nextLine();
        System.out.println("Платеж");
        double payment = sc.nextDouble();

        if (age <= 18) {
            System.out.println("Кредит не выдается");
        } else {
            System.out.println("Поздравляем! Вам кредит положено");
        }
        sc.close();

    }
}
