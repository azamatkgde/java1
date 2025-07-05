package collections.yryskeldi;

public class Program {
    public static void main(String[] args) {
        Order myOrder = new Order("Ноутбук", OrderStatus.PROCESSING);
        myOrder.printStatus(); // → Заказ иштелүүдө.
    }
}

