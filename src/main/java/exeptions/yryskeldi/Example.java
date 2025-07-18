package exeptions.yryskeldi;
import java.util.Scanner;
import java.io.IOException;

public class Example {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Атынызды жазыныз: ");
        String name = scanner.nextLine();

        System.out.print("Жашынызды жазыныз: ");
        int age = scanner.nextInt();

        try {
            registerUser(name, age);
            System.out.println("Каттоо ийгиликтуу аяктады!");
        }catch (IOException e) {
            System.out.println("Каттоо процесси аяктады (finally блогу).");
            scanner.close();
        }
    }
    public static void registerUser(String name, int age) throws IOException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Атыныз бош болбощу керек.");

        }
        if (age < 18) {
            throw new IOException("Жашыныз 18ден кичине. Каттоо болбойт.");
        }
        System.out.println("Кош келиниз," + name + "! Сиз ийгиликтуу катталдыныз.");
    }
}
