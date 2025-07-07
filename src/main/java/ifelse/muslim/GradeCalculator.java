package ifelse.muslim;

import java.util.Scanner; // Scanner классы колдонулушу үчүн импорт кошулат

public class GradeCalculator {

    // Метод, балл алып, баа чыгарган шарттар
    public void calculateGrade(int score) {
        if (score >= 90 && score <= 100) {
            System.out.println("Your grade is: A");
        } else if (score >= 80) {
            System.out.println("Your grade is: B");
        } else if (score >= 70) {
            System.out.println("Your grade is: C");
        } else if (score >= 60) {
            System.out.println("Your grade is: D");
        } else if (score >= 0) {
            System.out.println("Your grade is: F");
        } else {
            System.out.println("Invalid score. Please enter a number between 0 and 100.");
        }
    }

    public static void main(String[] args) {
        // Колдонуучу үчүн Scanner
        Scanner scanner = new Scanner(System.in);

        // GradeCalculator классынан объект түзүү
        GradeCalculator gc = new GradeCalculator();

        System.out.print("Enter your score (0-100): ");
        int score = scanner.nextInt();

        // Бааны эсептөө үчүн методду чакыруу
        gc.calculateGrade(score);

        scanner.close();
    }
}
