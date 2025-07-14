package polymorphism.zhanna;

public class Main {
    public static void main(String[] args) {
        //  Ар бир объектти Transport тибинде сактоо
        Transport[] transports = {
                new Car(),
                new Bike(),
                new Train()
        };

        //  Полиморфизм аркылуу методдорду иштетүү
        System.out.println("Бардык транспорт каражаттары кыймылдайт:");
        for (Transport transport : transports) {
            transport.move(); // Ар кайсы класстын өз move() методу иштейт
        }

        System.out.println("\n=== Жеке объекттер менен иштөө ===");

        // Жеке объекттерди Transport катары кароо
        Transport myTransport;

        myTransport = new Car();
        System.out.print("Менин транспортум: ");
        myTransport.move();

        myTransport = new Bike();
        System.out.print("Менин транспортум: ");
        myTransport.move();

        myTransport = new Train();
        System.out.print("Менин транспортум: ");
        myTransport.move();

        System.out.println("\n=== Кошумча маалымат ===");

        // Жалпы метод да иштейт
        Transport car = new Car();
        car.showInfo();
        car.move();
    }
}