package methods.erlan;

public class MethodZadanie2 {

//    public static void main(String[] args) {
//        System.out.println(max(14, 35));
//    }
//
//    public static int max(int x, int y) {
//        return (x > y) ? x : y;
//    }

    public static void main(String[] args) {
        int result = max(24, 46);
        System.out.println("Maksimalnoe znachenie in chisel: " + result);

    }

    public static int max(int x, int y) {
        int sum = Math.max(x, y);
        return sum;
    }
}
