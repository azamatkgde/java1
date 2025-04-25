package variable.meerim;


import java.util.Locale;
import java.util.Scanner;

public class Peremennye {
    public static void main(String[] args) {
        // Scanner'ди жаңы Locale менен түзүү
        Scanner sc = new Scanner( System.in ).useLocale( Locale.US );
        //Scanner sc = new Scanner(System.in);

        System.out.println( "Who are you?" );
        String iam = sc.nextLine();

        System.out.println( "How old are you?" );
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println( "Сен жаш экенсин, көп нерсеге жетишесиң!" );
        } else {
            System.out.println( "Сен чоң адамсың, келечек колуңда!" );
        }
        sc.nextLine(); // буферди тазалоо

        System.out.println( "Are you student? (true or false)" );
        boolean isStudent = sc.nextBoolean();
        if (isStudent) {
            System.out.println( "Окуу – ийгиликтин ачкычы! Алга!" );
        } else {
            System.out.println( "Окубай жатсаң да, өнүгүү эч качан токтобойт!" );
        }
        sc.nextLine();

        System.out.println( "Your height (cm):" );
        double height = sc.nextDouble();
        if (height < 150) {
            System.out.println( "Кызык, сен кичинекейсиңби?" );
        } else if (height <= 170) {
            System.out.println( "Орточо боюң бар экен!" );
        } else {
            System.out.println( "Оо, сен узунсуң го!" );
        }

        // Summary бөлүгү
        System.out.println( "\nSummary:" );
        System.out.println( "Name: " + iam );
        System.out.println( "Age: " + age );
        System.out.println( "Student: " + isStudent );
        System.out.println( "Height: " + height + " cm" );
        System.out.println( "Hello, " + iam + "!" );

        System.out.println( "-------------------------------------------------------" );
        // Примитивдик типтердин MAX маанисин чыгаруу
        System.out.println( "\nMax values of primitive types:" );
        System.out.println( "byte max: " + Byte.MAX_VALUE );
        System.out.println( "short max: " + Short.MAX_VALUE );
        System.out.println( "int max: " + Integer.MAX_VALUE );
        System.out.println( "long max: " + Long.MAX_VALUE );

        System.out.println( "--------------------------------------------------------" );
        // Арифметикалык операциялар
        int a = 15;
        int b = 4;
        System.out.println( "\nArithmetic Operations (a = 15, b = 4):" );
        System.out.println( "a + b = " + (a + b) );
        System.out.println( "a - b = " + (a - b) );
        System.out.println( "a * b = " + (a * b) );
        System.out.println( "a / b = " + (a / b) );
        System.out.println( "a % b = " + (a % b) );
        System.out.println("Buttu");


    }


}


