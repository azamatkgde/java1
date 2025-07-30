package enums.aibek.paymend;

public class Main {
    public static void main(String[] args) {
        PaymentMethod payment = PaymentMethod.CASH;

        switch (payment){
            case CASH:
                System.out.println("Төлөм накталай кабыл алынды.");
                break;
            case CARD:
                System.out.println("Төлөм карта менен жасалды.");
                break;
            case ONLINE:
                System.out.println("Төлөм онлайн кабыл алынды.");
                break;
        }
    }
}
