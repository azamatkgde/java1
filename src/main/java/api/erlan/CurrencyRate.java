package api.erlan;

public class CurrencyRate {
    private String baseCurrency;
    private String targetCurrency;
    private double rate;

    public CurrencyRate(String baseCurrency, String targetCurrency, double rate) {
        this.baseCurrency = baseCurrency;
        this.targetCurrency = targetCurrency;
        this.rate = rate;
    }

    public void print() {
        System.out.println("Базовая валюта: " + baseCurrency);
        System.out.println("Целевая валюта: " + targetCurrency);
        System.out.println("Курс: " + String.format("%.4f", rate));
    }

    public double getRate() {
        return rate;
    }
}

  


