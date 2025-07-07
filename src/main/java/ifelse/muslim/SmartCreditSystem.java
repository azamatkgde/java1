package ifelse.muslim;

import java.util.Scanner;

public class SmartCreditSystem{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String clientName = getClientName(scanner);

        if (hasCreditInAnotherBank(clientName)) {
            System.out.println("🚫 Кечиресиз, сиздин башка банктан алган кредитиңиз бар. Жаңы насыя берилбейт.");
            return;
        }

        int age = getAge(scanner);
        if (age < 21 || age > 66) {
            System.out.println("🚫 Жашыңыз 21 менен 66 арасында болушу керек.");
            System.out.println("❌❌");
            return;
        }

        double income = getIncome(scanner);
        if (income < 40000) {
            System.out.println("🚫 Айлык кирешеңиз 40,000 сомдон жогору болушу керек.");
            System.out.println("❌");
            return;
        }

        int experience = getExperience(scanner);
        if (experience < 2) {
            System.out.println("🚫 Иш тажрыйбаңыз жетишсиз.");
            System.out.println("❌");
            return;
        }

        String creditHistory = getCreditHistory(scanner);
        if (!creditHistory.equalsIgnoreCase("ооба")) {
            System.out.println("🚫 Кредиттик тарыхыңыз жакшы эмес.");
            System.out.println("❌");
            return;
        }

        double otherDebt = getDebtInfo(scanner);

        double monthlyPayment = calculateLoan(scanner);

        double monthlyOtherDebt = otherDebt / 12;
        double totalMonthlyDebt = monthlyOtherDebt + monthlyPayment;

        if (totalMonthlyDebt > income) {
            System.out.println("🚫 Айлык кирешеңиз башка карыздар жана жаңы кредит үчүн жетишсиз.");
            System.out.println("❌");
            return;
        }

        System.out.println("🎉 Куттуктайбыз! Кредит берилет.");
        scanner.close();
    }

    // -------------------- Client Information --------------------

    private static String getClientName(Scanner scanner) {
        System.out.print("👤 Аты-жөнүңүздү жазыңыз: ");
        return scanner.nextLine();
    }

    private static boolean hasCreditInAnotherBank(String clientName) {
        return clientName.equalsIgnoreCase("Саидов Муслим") ||
                clientName.equalsIgnoreCase("Муслим Саидов") ||
                clientName.equalsIgnoreCase("Алыбаев Турат") ||
                clientName.equalsIgnoreCase("Турат Алыбаев") ||
                clientName.equalsIgnoreCase("Токтакунов Азамат") ||
                clientName.equalsIgnoreCase("Азамат Токтакунов");
    }

    // -------------------- User Input Methods --------------------

    private static int getAge(Scanner scanner) {
        System.out.print("🧓 Жашыңызды киргизиңиз: ");
        return scanner.nextInt();
    }

    private static double getIncome(Scanner scanner) {
        System.out.print("💰 Айлык кирешеңизди киргизиңиз: ");
        return scanner.nextDouble();
    }

    private static int getExperience(Scanner scanner) {
        System.out.print("📆 Иш тажрыйбаңызды жыл менен: ");
        return scanner.nextInt();
    }

    private static String getCreditHistory(Scanner scanner) {
        System.out.print("📊 Кредиттик тарыхыңыз жакшыбы? (ооба/жок): ");
        scanner.nextLine(); // cleanup
        return scanner.nextLine();
    }

    private static double getDebtInfo(Scanner scanner) {
        System.out.print("💳 Башка карызыңыз барбы? (ооба/жок): ");
        String hasDebt = scanner.nextLine();
        if (hasDebt.equalsIgnoreCase("ооба")) {
            System.out.print("Карыздын суммасын киргизиңиз: ");
            double otherDebt = scanner.nextDouble();
            scanner.nextLine(); // cleanup
            return otherDebt;
        }
        return 0;
    }

    // -------------------- Loan Calculation --------------------

    private static double calculateLoan(Scanner scanner) {
        System.out.print("Канча суммадагы кредит керек? (сом): ");
        double loanAmount = scanner.nextDouble();

        double interestRate = 20.0;
        System.out.println("🏦 Банк тарабынан берилген жылдык пайыз: " + interestRate + "%");

        System.out.print("Кредит мөөнөтү (ай): ");
        int months = scanner.nextInt();

        double totalInterest = loanAmount * (interestRate / 100);
        double monthlyPayment = (loanAmount + totalInterest) / months;

        System.out.println("📄 Жалпы пайыз: " + totalInterest + " сом");
        System.out.println("💳 Ай сайын төлөмүңүз: " + monthlyPayment + " сом");

        return monthlyPayment;
    }
}
