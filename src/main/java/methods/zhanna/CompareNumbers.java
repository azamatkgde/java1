package methods.zhanna;

public class CompareNumbers {
    // Метод: эки санды салыштыруучу жана чоң санды кайтарып берчү метод
    public static int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        // Методду чакыруу жана натыйжаны экранга чыгаруу
        System.out.println(max(5, 9));  // Чыгуу: 9
    }
}
