package interfaces.Bekbolot.payment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя владельца:");
        String name = scanner.nextLine();

        System.out.println("\nВыберите способ оплаты:");
        System.out.println("1 - Кредитная карта");
        System.out.println("2 - PayPal");
        System.out.println("3 - Банковский перевод");
        System.out.print("Ваш выбор: ");
        int option = scanner.nextInt();

        PaymentMethod method = null;

        switch (option) {
            case 1 -> method = new CreditCard(name);
            case 2 -> method = new PayPal(name);
            case 3 -> method = new BankTransfer(name);
            default -> {
                System.out.println("Неверный выбор.");
                System.exit(0);
            }
        }

        System.out.print("\nВведите сумму оплаты (€): ");
        double amount = scanner.nextDouble();

        System.out.println("\n========== ОПЛАТА ==========");
        method.showHolder();
        method.pay(amount);

        // Проверка на возможность возврата
        if (method instanceof Refundable) {
            System.out.print("\nХотите сделать возврат? (да/нет): ");
            scanner.nextLine(); // очистка после nextDouble
            String answer = scanner.nextLine().toLowerCase();

            if (answer.equals("да") || answer.equals("yes")) {
                System.out.print("Введите сумму возврата (€): ");
                double refundAmount = scanner.nextDouble();
                ((Refundable) method).refund(refundAmount);
            }
        } else {
            System.out.println("\nЭтот способ оплаты не поддерживает возврат.");
        }

        scanner.close();
    }
}
