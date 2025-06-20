package interfaces.Bekbolot.payment;

public abstract class PaymentMethod {
    protected String holderName;

    public PaymentMethod(String holderName) {
        this.holderName = holderName;
    }

    public void showHolder() {
        System.out.println("Владелец: " + holderName);
    }

    public abstract void pay(double amount); // абстрактный метод
}
