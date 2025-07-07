package oop.erlan;

public class MainPhone {
    public static void main(String[] args) {
        Phone phone = new Phone("Nokia ", "6300 ", 120);
        phone.printInfo();

        System.out.println("<<<<<<<<<<<<<Smartphone>>>>>>>>>>>>>");
        Smartphone smartphone = new Smartphone("iPhone ", "16 Pro ", 999, true, false);
//        smartphone.printInfo();
        smartphone.printSmartphoneInfo();

    }
}
