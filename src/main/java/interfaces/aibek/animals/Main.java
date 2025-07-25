package interfaces.aibek.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog =  new Dog();
        dog.makeSound();
        dog.eat();
        Cat cat = new Cat();
        cat.makeSound();
        cat.eat();
    }
}
