package records.aizat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя пользователя: ");
        String username = scanner.nextLine();

        System.out.print("Введите пароль (Пароль должен быть не меньше 6 символов): ");
        String password = scanner.nextLine();

        Userr user = new Userr(username, password);

        System.out.println("Имя: " + user.username());
        System.out.println("Пароль: " + user.password());
    }
}
