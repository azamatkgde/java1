package methods.yryskeldi;

public class Greeting {
    public static void greetUser(String name) {
        System.out.println("Салам, " + name + "!");
    }
    public static void main(String[] args) {
        greetUser("Ainura");
        greetUser("Bakyt");
    }
}
