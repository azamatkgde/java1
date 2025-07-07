package methods.baima;

public class ExampleMethods {
    public static void main (String[] args) {
        int a = 5;
        int b = 9;
        int result = max (a, b);
        System.out.println("Эн чон сан: "+ result);
    }

    public static int max (int x, int y ) {
        if (x>y) {
            return x;
        } else {
            return y;
        }
    }
}
