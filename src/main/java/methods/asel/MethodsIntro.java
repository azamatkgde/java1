package methods.asel;

public class MethodsIntro {
    public static void main(String[] args) {
        sayHello();
        int result = add(10,20);
        System.out.println(result);

        getUser("Asel");

    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void getUser(String name) {
        System.out.println("My name is " + name);
    }

    public static void sayHello() {
        System.out.println("Hello World");
    }
}
