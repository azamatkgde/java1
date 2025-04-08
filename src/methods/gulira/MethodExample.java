package methods.gulira;

public class MethodExample {
    public static void main(String[] args) {
        System.out.println("Салам Дүйнө!");
        int summ = add(35, 76);
        getUser(  "Гулира");
    }
    public static  int add(int a, int b) {
        return a+b;
    }
    public static  void getUser(String name) {
        System.out.println("Менин атым - " + name);
    }
}
