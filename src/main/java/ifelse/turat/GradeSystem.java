package ifelse.turat;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Баллды киргизиңиз (0-100): ");
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Сиздин бааңыз: 5");
        } else if (score >= 70 && score <= 89) {
            System.out.println("Сиздин бааңыз: 4");
        } else if (score >= 50 && score <= 69) {
            System.out.println("Сиздин бааңыз: 3");
        } else if (score >= 0 && score <= 49) {
            System.out.println("Сиздин бааңыз: 2");
        } else {
            System.out.println("Ката: Сиз киргизип жаткан балл 0 менен 100дүн ортосунда болушу керек.");
        }

        scanner.close();
    }
}
