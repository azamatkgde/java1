package enums.aibek.order;

public class Main {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.SHIPPED;

        switch (status){
            case PENDING:
                System.out.println("Заказ кабыл алынды ");
                break;
            case PROCESSING:
                System.out.println("Заказ даярдалып жатат ");
                break;
            case SHIPPED:
                System.out.println("Заказ жонотулду");
                break;
            case DELIVERED:
                System.out.println("Заказ жеткирилди ");
                break;
        }
    }
}
