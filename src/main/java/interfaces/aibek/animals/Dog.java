package interfaces.aibek.animals;

public class Dog implements Animals {
    @Override
    public void makeSound() {
        System.out.println("Woof woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones");

    }
}
