package variable.sezim;

import java.util.Scanner;

public class CreditApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Как вас зовут");
        String name = sc.nextLine();
        System.out.println("как ваша фамилия?");
        String lastName = sc.nextLine();
        System.out.println("Сколько Вам лет?");
        int age =sc.nextInt();
        System.out.println("Сумма кредита");
        double amount = sc.nextDouble();
        System.out.println("Срок кредита в месяцах");
        int month = sc.nextInt();
        System.out.println("Ваш ежемесячный доход");
        int salary = sc.nextInt();
        System.out.println("Цель кредита");
        String purpose = sc.nextLine();
        sc.nextLine();
        System.out.println("Наличие других кредитов?(false/true)");
        boolean isCredit = sc.nextBoolean();
        System.out.println("Ваш номер телефона");
        String number = sc.nextLine();
        sc.nextLine();
        System.out.println("Ежемесячный платеж");
        double sumMonth = sc.nextDouble();

        if (age < 18) {
            System.out.println("Вам не положено брать кредит");
        }else {
            System.out.println("Вы можете взять кредит");
        }

    }

}
