package interfaces.Bekbolot;

public class BankTransfer extends PaymentMethod {

    public BankTransfer(String holderName) {
        super(holderName);
    }

    @Override
    public void pay(double amount) {
        System.out.println("Банк аркылуу төлөө: " + amount + "€");
    }

}
