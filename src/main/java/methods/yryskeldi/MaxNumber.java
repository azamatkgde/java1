package methods.yryskeldi;

public class MaxNumber {
    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
    public static void main(String[] args) {
        System.out.println(max(5, 9));
        System.out.println(max(12, 7));
    }
}
