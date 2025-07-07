package ifelse.zhanna.ifelse;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Баллды киргизиңиз (0-100): ");
       /* int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Баа: 5");
        } else if (score >= 70 && score <= 89) {
            System.out.println("Баа: 4");
        } else if (score >= 50 && score <= 69) {
            System.out.println("Баа: 3");
        } else if (score >= 0 && score <= 49) {
            System.out.println("Баа: 2");
        } else {
            System.out.println("Туура эмес балл киргизилди.");
        }

        scanner.close();*/
        System.out.print("Баллды киргизиңиз (0-100): ");
        int score = new Scanner(System.in).nextInt();
        if (score >= 90) System.out.println("Баа: 5");
        else if (score >= 70) System.out.println("Баа: 4");
        else if (score >= 50) System.out.println("Баа: 3");
        else if (score >= 0) System.out.println("Баа: 2");
        else System.out.println("Туура эмес балл киргизилди.");
    }
    }

