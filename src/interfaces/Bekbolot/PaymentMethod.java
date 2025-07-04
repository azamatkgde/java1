package interfaces.Bekbolot;

public abstract class PaymentMethod {
    protected String holderName;

    public PaymentMethod(String holderName) {
        this.holderName = holderName;
    }

    public void showHolder() {
        System.out.println("Ээси: " + holderName);
    }

    public abstract void pay(double amount);
}
