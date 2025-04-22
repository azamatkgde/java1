package oop.aizat.aizatkonst2;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Phone phone = new Phone("Nokia");
        phone.printInfo();

        System.out.println("-------------Smartphone-----------");
        Smartphone smartphone = new Smartphone("iPhone", true);
        smartphone.printSmartphoneInfo();

    }
}
