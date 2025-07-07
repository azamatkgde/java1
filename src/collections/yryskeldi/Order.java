package collections.yryskeldi;

public class Order {
    private final OrderStatus status;

    public Order(String ignoredProductName, OrderStatus status) {
        this.status = status;
    }

    public void printStatus() {
        switch (status) {
            case NEW -> System.out.println("Заказ жаңы түзүлдү.");
            case PROCESSING -> System.out.println("Заказ иштелүүдө.");
            case SHIPPED -> System.out.println("Заказ жөнөтүлдү.");
            case DELIVERED -> System.out.println("Заказ жеткирилди.");
            case CANCELLED -> System.out.println("Заказ жокко чыгарылды.");
        }
    }
}
