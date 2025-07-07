package methods.turat;

public class CompareThreeNumbers {
    // Метод: үч сандын эң чоңун табуу
    public static int max(int x, int y, int z) {
        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        System.out.println("Эң чоң сан: " + max(5, 9, 3));   // 9
        System.out.println("Эң чоң сан: " + max(12, 7, 15)); // 15
        System.out.println("Эң чоң сан: " + max(20, 20, 18)); // 20
    }
}
