package variable.zhanna;
import java.util.Scanner;

public class Anketa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String переменные
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your city: ");
        String city = scanner.nextLine();

        // int переменные
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // boolean переменные
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Вывод анкеты
        System.out.println("\n--- Anketa ---");
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
        System.out.println("Student: " + (isStudent ? "Yes" : "No"));
    }
}
