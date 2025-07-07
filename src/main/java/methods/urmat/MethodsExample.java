package methods.urmat;

public class MethodsExample {
    public static void main(String[] args) {
        int sum = add(10, 20);
        System.out.println(sum);
        greetUser("Urmat");
        greetUser("Samat");
        greetUser("Venera");
        max(6, 4);
        max(8, 10);
        max(5, 5);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    //Жонокой метод
    public static void greetUser(String name) {
        System.out.println("Привет " + name + "!");
    }

    //Сандарды салыштыруучу метод
    public static void max(int x, int y){
        if (x > y) {
            System.out.println(x);
        } else if (x < y){
            System.out.println(y);
        } else System.out.println("Алар барабар");
    }
}