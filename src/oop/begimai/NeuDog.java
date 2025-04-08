package oop.begimai;

public class NeuDog {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.age=5;
        dog.gewicht=10;
        dog.name="aktosch";
        dog.paroda="buldog";

       System.out.println("jach " + dog.age);
       System.out.println("salmak " + dog.gewicht);
       System.out.println("paroda " + dog.paroda);
       System.out.println("at " + dog.name);

    }
}
