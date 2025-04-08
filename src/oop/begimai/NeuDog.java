package oop.begimai;

public class NeuDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name= "Aktosch";
        dog.age=5;
        dog.gewicht=10;
        dog.paroda="buldog";

        System.out.println("name " + dog.name);
        System.out.println("age " + dog.age);
        System.out.println("gewicht " + dog.gewicht);
        System.out.println("paroda " + dog.paroda);
    }
}
