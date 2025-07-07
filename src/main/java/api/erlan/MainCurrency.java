package api.erlan;

public class MainCurrency {
    public static void main(String[] args) {
        CurrencyRateService service = new CurrencyRateService();

        CurrencyRate rate = service.getRateByPair("USD/KGS"); // Обратная пара!
        if (rate != null) {
            rate.print();
        } else {
            System.out.println("Курс не найден.");
        }
    }
}