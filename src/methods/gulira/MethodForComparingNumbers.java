package methods.gulira;

public class MethodForComparingNumbers {
        public static int max(int x, int y) {
            if (x > y) {
                return x;
            } else {
                return y;
            }
        }

        public static void main(String[] args) {
            int result = max(180, 290);
            System.out.println("Максималдуу сан: " + result);
        }

}
