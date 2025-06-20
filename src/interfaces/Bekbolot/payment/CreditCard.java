package interfaces.Bekbolot.payment;

public class CreditCard extends PaymentMethod implements Refundable {

    public CreditCard(String holderName) {
        super(holderName);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата картой на сумму: " + amount + "€");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Возврат на карту: " + amount + "€");
    }
}
