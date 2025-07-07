package methods.aibek;

public class MethodsExample2 {
    public static void main(String[] args) {
        System.out.println(max(10, 15));
        System.out.println(max(50, 20));

    }
    public static int max (int x, int y){
        if (x>y){
            return x;
        }else {
            return y;
        }
    }
}
