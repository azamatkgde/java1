package generics.aizat;

public class Main {
    public static void main(String[] args){
        Box<String> stringBox = new Box<>("Aizat");
        Box<Integer> integerBox = new Box<>(26);

        System.out.println("My name is " + stringBox.get());
        System.out.println("I am " + integerBox.get() + " years old");
    }
}
