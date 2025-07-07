package methods.azamat;

public class ExampleMethods {
    public static void main(String[] args) {
        sayHello();

        int sum = add(10, 15);
        System.out.println(sum);
        getUser("Ainura");
        getUser("Бачайы");
        getUser("Ажибай");

        System.out.println(isEven(10));
        System.out.println(isEven(11));

        if(isEven(10)) {
            System.out.println("Четное");
        } else {
            System.out.println("Не четное");
        }
    }

    public static void sayHello() {
        System.out.println("Hello world!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void getUser(String name) {
        System.out.println("Салам " + name);
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}