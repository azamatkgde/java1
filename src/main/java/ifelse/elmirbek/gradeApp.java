package ifelse.elmirbek;
import java.util.Arrays;
import java.util.Scanner;

public class gradeApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Баало системасына кош келиниз");
        System.out.println("Бугун канча баа алдыныз : ");

        // 90–100: «5»
        // 70–89: «4»
        // 50–69: «3»
        // 0–49: «2»

        // начнем сразу с проверки чтобы user не написал не правильные символы кроме int

        if (scanner.hasNextInt()) {
            int grade = scanner.nextInt();
            if (grade >= 90) {
                System.out.printf("Куттуктайм сиз 5 деген баага татыктуусуз сиз алган баа : %d\n ", grade);
            } else if (grade >= 70) {
                System.out.printf("Куттуктайм сиз 4 деген баага татыктуусуз сиз алган баа : %d\n", grade);
            } else if (grade >= 69) {
                System.out.printf("Куттуктайм сиз 3 деген баага татыктуусуз сиз алган баа : %d кийнки жолу дагы аракет кылуу бир гана сиздин колунузда !!! \n", grade);
            } else {
                System.out.printf("Куттуктайм сиз 2 деген баага татыктуусуз сиз алган баа : %d кийнки жолу аракет кылуу бир гана сиздин колунузда !!! \n", grade);
            }
        } else {
            System.out.println("Алган бааны сан турундо жазуу зарыл !!! ");
        }
        scanner.close();
    }
}
