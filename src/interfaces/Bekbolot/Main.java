package interfaces.Bekbolot;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Атыңызды жазыңыз:");
        String name = scanner.nextLine();

        System.out.println("\nТөлөө ыкмасын тандаңыз:");
        System.out.println("1 - Кредиттик карта ");
        System.out.println("2 - PayPal");
        System.out.println("3 - Банк аркылуу которуу");
        System.out.print("Сиздин тандооңуз: ");
        int option = scanner.nextInt();

        PaymentMethod method = null;

        switch (option) {
            case 1 -> method = new CreditCard(name);
            case 2 -> method = new PayPal(name);
            case 3 -> method = new BankTransfer(name);
            default -> {
                System.out.println("Туура эмес тандоо.");
                System.exit(0);
            }
        }

        System.out.print("\nТөлөнүүчү сумманы жазыңыз:(€): ");
        double amount = scanner.nextDouble();

        System.out.println("\n========== ТӨЛӨӨ  ==========");
        method.showHolder();
        method.pay(amount);

        // refund текшерүү
        if (method instanceof Refundable) {
            System.out.print("\nКайтаруу керекпи? (ооба/жок): ");
            scanner.nextLine();
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("ооба") || answer.equals("да")) {
                System.out.print("\"Кайтарылуучу сумма: (€): ");
                double refundAmount = scanner.nextDouble();
                ((Refundable) method).refund(refundAmount);
            }
        } else {
            System.out.println("\nБул ыкма кайтарууну колдобойт.");
        }

        scanner.close();
    }
}
