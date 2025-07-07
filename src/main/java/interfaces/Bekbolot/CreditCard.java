package interfaces.Bekbolot;

public class CreditCard extends PaymentMethod implements Refundable {

    public CreditCard(String holderName) {
        super(holderName);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Карта менен төлөө: " + amount + "€");
    }

    @Override
    public void refund(double amount) {
        System.out.println("Картага кайтаруу: " + amount + "€");
    }
}
