package oop.azhibai;

public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.name = "Garfield";
        cat.age = 8;
        cat.color = "Ак";
        cat.weigth = 10;

        cat.run();

        Car car = new Car();
        car.model = "Tayota Camry";
        car.year = 2010;
        car.color = "кара";
        car.country = "Япония";

        car.tayota();

    }


}
