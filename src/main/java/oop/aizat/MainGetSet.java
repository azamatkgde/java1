package oop.aizat;

public class MainGetSet {
    public static void main(String[] args) {
        // Пустой конструктор:
        CarGetSet hello = new CarGetSet();
        hello.setName("Tesla6789abc");
        hello.setYear(2022);
        hello.setColor("Red");
        hello.setOrigin("USA");
        hello.setMake("Tesla");

        // Конструктор с параметрами:
        CarGetSet salam = new CarGetSet("BMW12345abc", 2025, "Black-Grey", "Germany", "BMW");


        System.out.println("Название машины:" + hello.getName() + "\n Год выпуска: "  + hello.getYear() + "\n Цвет: " + hello.getColor()+
                "\n Происхождение: " + hello.getOrigin() + "\n Марка:  " + hello.getMake());

        System.out.println("\n----- Второй объект -----");
        System.out.println("Название машины:" + salam.getName() + "\n Год выпуска: "  + salam.getYear() + "\n Цвет: " + salam.getColor()+
                "\n Происхождение: " + salam.getOrigin() + "\n Марка:  " + salam.getMake());
    }
}
