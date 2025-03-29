package oop.azamat;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone("Nokia");
        phone.printInfo();

        System.out.println("-------------Smartphone-----------");
        Smartphone smartphone = new Smartphone("iPhone", true);
        smartphone.printSmartphoneInfo();

    }
}
