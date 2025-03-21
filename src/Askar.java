import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("10:");
        int n = scanner.nextInt();

        System.out.println("Tablica umnojenie dlya" + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "*" + i + "=" + (n * i));

        }


    }


}
