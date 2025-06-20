package interfaces.Bekbolot.payment;

public class PayPal extends PaymentMethod implements Refundable {

    public PayPal(String holderName) {
        super(holderName);
    }
    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal: " + amount + "€");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возврат на PayPal: " + amount + "€");
    }
}
