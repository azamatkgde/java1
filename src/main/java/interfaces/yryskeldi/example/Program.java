package interfaces.yryskeldi.example;

public class Program {
    public static void main (String [] args ) {
        Animal dog = new Dog ();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();
    }
}
