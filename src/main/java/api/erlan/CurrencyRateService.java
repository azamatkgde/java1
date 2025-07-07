package api.erlan;

import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class CurrencyRateService {
    private Map<String, CurrencyRate> rates;

    public CurrencyRateService() {
        rates = new HashMap<>();
        rates.put("USD/EUR", new CurrencyRate("USD", "EUR", 0.92));
        rates.put("USD/JPY", new CurrencyRate("USD", "JPY", 151.2));
        rates.put("USD/KGS", new CurrencyRate("USD", "KGS", 87.45));
        rates.put("EUR/KGS", new CurrencyRate("USD", "KGS", 99.88));
        // Обратный EUR/USD теперь не задаём — он будет рассчитываться автоматически
    }


    public CurrencyRate getRateByPair(String pair) {
        if (rates.containsKey(pair)) {
            return rates.get(pair);
        }

//        // Пытаемся найти обратную пару
//        String[] parts = pair.split("/");
//        if (parts.length == 2) {
//            String reversePair = parts[1] + "/" + parts[0];
//            CurrencyRate reverseRate = rates.get(reversePair);
//            if (reverseRate != null) {
//                double invertedRate = 1.0 / reverseRate.getRate();
//                return new CurrencyRate(parts[0], parts[1], invertedRate);
//            }
//        }

        return null; // Курс не найден
    }
}
