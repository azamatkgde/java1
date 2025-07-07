package variable.azamat.gulira;
import java.util.Scanner;

public class variables {

    public static void main(String[] args) {
        String firstName = "Gulira";
        String lastName = "Kalykova";
        int age = 36;
        double height = 1.65;
        boolean hasJob = true;

        System.out.println("Менин атым: " + firstName);
        System.out.println("Менин фамилиям: " + lastName);
        System.out.println("Менин жашым: " + age);
        System.out.println("Менин боюм: " + height + "см");
        System.out.println("Иштейм: " + hasJob);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Канча жаштасын? ");
        int age1 = scanner.nextInt();
        System.out.println("Анда сен менден " + (age - age1) + " жаш кичуусун, эже деп жур!");

        scanner.close();

        boolean isYes = true;
        boolean isNo = false;

        System.out.println("Сабакка катыштынбы жана тапшырманы аткардынбы? " + (isYes && isNo));
        System.out.println("Сабакка катыштынбы же тапшырманы аткардынбы? " + (isYes || isNo));
        System.out.println("Сабакка катыштын, ээ? " + (!isYes));

    }
}
