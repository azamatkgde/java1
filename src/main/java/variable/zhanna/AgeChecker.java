package variable.zhanna;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Колдонуучудан жашын сурайбыз
        System.out.print("Жашыңызды киргизиңиз: ");
        int age = scanner.nextInt();

        // Логикалык шарттар
        if (age < 0) {
            System.out.println("Туура эмес жаш!");
        } else if (age < 7) {
            System.out.println("Сиз наристесиз.");
        } else if (age < 18) {
            System.out.println("Сиз өспүрүмсүз.");
        } else if (age < 60) {
            System.out.println("Сиз чоң адамсыз.");
        } else {
            System.out.println("Сиз кары адамсыз.");
        }
    }
}
