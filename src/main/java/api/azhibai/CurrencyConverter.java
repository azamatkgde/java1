package api.azhibai;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        double usdRate = 0.0115;
        double eurRate = 0.0107;
        double kgsRate = 1;


        Scanner scanner = new Scanner(System.in);

        System.out.println("Конвертациялоо үчүн суммаңызды киргизиңиз (сом):");
        double amount = scanner.nextDouble();

        System.out.println("Каалаган валютаны тандаңыз (USD, EUR, KGS):");
        String currency = scanner.next().toUpperCase();

        double result = 0;
        if (currency.equals("USD")) {
            result = amount * usdRate;
        } else if (currency.equals("EUR")) {
            result = amount * eurRate;
        } else if (currency.equals("KGS")) {
            result = amount;
        } else {
            System.out.println("Курс табылган жок.");
            return;
        }

        System.out.printf("Сиздин %.2f сомдук суммаңыз %s валютасына %.2f болуп конвертацияланды.\n", amount, currency, result);
    }
}



