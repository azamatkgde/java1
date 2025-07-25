package interfaces.aibek.animals;

public class Cat implements Animals {
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat fish");
    }
}
