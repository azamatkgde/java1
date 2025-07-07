package oop.turat;

public class Main {
    public static void main(String[] args) {
        // Эки объект жаратуу
        Cat cat1 = new Cat("Ак мышык", -3);
        Cat cat2 = new Cat("Кара мышык", 5);
        Cat cat3 = new Cat("Сары мышык",  2);
        Cat cat4 = new Cat("Мышык", 2);

        // Методдорду чакыруу
        cat1.meow();
        cat1.showInfo();


        cat2.meow();
        cat2.showInfo();

        cat3.meow();
        cat3.showInfo();

        cat4.meow();
        cat4.showInfo();

        HomeCat cat5 = new HomeCat("Мурка", 2, "Сиямский", 5);

        WildCat cat6 = new WildCat("Илбирс", 5, true, true);

        if (cat6.isDangerous) {
            System.out.println("Зоопаркка алып барыш керек");
        }
    }
}
