package variable;

import java.util.Locale;
import java.util.Scanner;

public class Meerim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale( Locale.US);;

        System.out.println("Who are you?");
        String iam = sc.nextLine();

        System.out.println("How old are you?");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("Сен жаш экенсин, көп нерсеге жетишесиң!");
        } else {
            System.out.println("Сен чоң адамсың, келечек колуңда!");
        }
        sc.nextLine();

        System.out.println("Are you student? (true or false)");
        boolean isStudent = sc.hasNextBoolean();
        if (isStudent) {
            System.out.println("Окуу – ийгиликтин ачкычы! Алга!");
        } else {
            System.out.println("Окубай жатсаң да, өнүгүү эч качан токтобойт!");
        }
        sc.nextLine();

        System.out.println("Your height");
        double height = sc.nextDouble();
        if (height < 150) {
            System.out.println("Кызык, сен кичинекейсиңби?");
        } else if (height >= 150 && height <= 170) {
            System.out.println("Орточо боюң бар экен!");
        } else {
            System.out.println("Оо, сен узунсуң го!");
        }
        sc.nextLine();


        System.out.println("\nSummary:");
        System.out.println("Name: " + iam);
        System.out.println("Age: " + age);
        System.out.println("Student: " + isStudent);
        System.out.println("Height: " + height + " cm");
        System.out.println("Hello,"+ iam + "!");

    }
}
