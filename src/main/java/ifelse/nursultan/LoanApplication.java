package ifelse.nursultan;

import java.util.Scanner;

public class LoanApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Атынызды жазыныз: ");
        String name = scanner.nextLine();

        System.out.println(("Фамилиянызды жазыныз: "));
        String lastName = scanner.nextLine();

        System.out.println("Жашынызды жазыныз: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (age < 18) {
            System.out.println("Кечириниз, " + name + " " + lastName + "кредит алуу учун жашыныз 18 ден кем болбошу керек");
            scanner.close();
            return;
        }

        System.out.println("Кредиттин суммасы: ");
        double amount = scanner.nextDouble();

        System.out.println("Кредиттин моонотун жазыныз (ай менен): ");
        int termMonths = scanner.nextInt();

        System.out.print("Айлык кирешеңизди жазыныз: ");
        double income = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Кредит алуунун максаты: ");
        String purpose = scanner.nextLine();

        System.out.print("Башка кредитериниз барбы? (ооба/жоок): ");
        String hasOtherLoans = scanner.nextLine();

        System.out.print("Байланыш номеринизди жазыныз: ");
        String phone = scanner.nextLine();

        double monthlyPayment = amount / termMonths;

        System.out.println("\n=== Насыяга арыз ===");
        System.out.println("Аты: " + name);
        System.out.println("Фамилиясы: " + lastName);
        System.out.println("Жашы: " + age);
        System.out.println("Кредиттин суммасы: " + amount + " сом");
        System.out.println("Моонот: " + termMonths + " ай");
        System.out.println("Бир айлык киреше: " + income + " сом");
        System.out.println("Кредиттин максаты: " + purpose);
        System.out.println("Башка кредит: " + hasOtherLoans);
        System.out.println("Байланыш номер: " + phone);
        System.out.printf("Бир айлык толом: %.2f сом\n", monthlyPayment);

        scanner.close();


    }
}
