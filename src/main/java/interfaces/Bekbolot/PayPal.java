package interfaces.Bekbolot;

public class PayPal extends PaymentMethod implements Refundable {

    public PayPal(String holderName) {
        super(holderName);
    }
    @Override
    public void pay(double amount) {
        System.out.println("PayPal менен төлөө: " + amount + "€");
    }

    @Override
    public void refund(double amount) {
        System.out.println("PayPal аркылуу кайтаруу: " + amount + "€");
    }
}