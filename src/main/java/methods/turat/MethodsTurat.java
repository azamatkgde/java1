package methods.turat;

public class MethodsTurat {

    // Бул болсо бош метод, эч нерсе кайтарбайт.
    public static void greetUser(String name) {
        greetUser("Turat Alybaev");
    }

    // А бул метод эки санды салыштырып, чоңун кайтарат
    public static int max(int x, int y) {
        return Math.max(x, y);
    }

    public static void main(String[] args) {
        System.out.println("Чоң сан: " + max(5, 9));  // Натыйжа: 9
        System.out.println("Чоң сан: " + max(15, 3)); // Натыйжа: 15
    }
}
