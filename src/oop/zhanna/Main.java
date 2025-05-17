package oop.zhanna;

public class Main {
    public static void main(String[] args) {
        // Биринчи объект
        Cat cat1 = new Cat();
        cat1.name = "Murka";
        cat1.age = 2;

        // Экинчи объект
        Cat cat2 = new Cat();
        cat2.name = "Barsik";
        cat2.age = 4;

        // Методдорду чакыруу
        cat1.displayInfo();
        cat1.meow();

        System.out.println(); // Бош сап чыгарат

        cat2.displayInfo();
        cat2.meow();
    }
}
