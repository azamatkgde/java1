public class Asan {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("плюс: " + i);
        }
        for (int i = 10; i >= 1; i--) {
            System.out.println("минус" + i);
        }
    }
}
