package oop.baima;

public class PhoneSmartphoneMain {
    public static void main(String[] args){
        Phone phone = new Phone ("Nokia", "3310",  99);

        System.out.println("------------------Smartphane-------------");
        Smartphone Smartphone = new Smartphone ( "iPhone", "16 Pro",  999,  true,  false);
        Smartphone.printInfo();
        Smartphone.printSmartphoneInfo();
    }

}
