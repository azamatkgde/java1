package interfaces.aizat;

public class Pay implements Payment{
    @Override
    public void pay(double amount) {
            System.out.println("Оплачено " + amount + "$" + " через карту.");

    }
}
