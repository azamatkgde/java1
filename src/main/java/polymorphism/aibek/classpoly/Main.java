package polymorphism.aibek.classpoly;

public class Main {
    public static void main(String[] args) {
       /* Animal animal = new Animal();
        animal.sound();


        Dog dog = new Dog();
        dog.sound();*/

        Animal animal = new Dog();
        Animal cat = new Cat();
        animal.sound();
        cat.sound();
        localAnimal(animal);
    }
    public static void localAnimal (Animal animal ){
        animal.sound();
    }
}
