package oop.asan;

public class Main1 {
    public static void main(String[] args){

        Phone phone = new  Phone( "Nokia");
        phone.printInfo();

        System.out.println("------- Smartphone ---------");
        Smartphone smartphone = new Smartphone("Iphone",true);
        smartphone.printSmartphoneInfo();
    }
}
