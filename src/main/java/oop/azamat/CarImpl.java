package oop.azamat;

public class CarImpl {
    public static void main(String[] args) {

        /*Phone phone = new Phone("Nokia");
        phone.printInfo();

        System.out.println("-------------Smartphone-----------");
        Smartphone smartphone = new Smartphone("iPhone", true);
        smartphone.printSmartphoneInfo();*/

        System.out.println("Объект түзүп, ичиндеги методду чакырдык");

        Car atamaMashine = new Car();



        atamaMashine.setModel("Toyota Camry");
        atamaMashine.setYear(-2025);
        atamaMashine.sayHello();

        Car apamaMashine = new Car();
        apamaMashine.setModel("Kia Optima");
        apamaMashine.setYear(2025);
        apamaMashine.setColor("Кызыл");
        apamaMashine.sayHello();

        System.out.println("Тузүлгөн обхектини getter (алгыч) аркылуу уникалдуу кылып жазып алдык.");
        System.out.println("Атама " + atamaMashine.getModel() + " моделиндеги " + atamaMashine.getYear() + " жылкы " + atamaMashine.getColor() + " түстөгү машине алып бердим");
        System.out.println("ал эми апама " + apamaMashine.getModel() + " моделиндеги " + apamaMashine.getYear() + " жылкы " + apamaMashine.getColor() + " түстөгү машине алып бердим");


    }
}
