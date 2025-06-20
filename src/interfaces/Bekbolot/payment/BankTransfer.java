package interfaces.Bekbolot.payment;

public class BankTransfer extends PaymentMethod {

    public BankTransfer(String holderName) {
        super(holderName);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Оплата переводом: " + amount + "€");
    }

    // НЕТ возврата → не реализует интерфейс Refundable
}
