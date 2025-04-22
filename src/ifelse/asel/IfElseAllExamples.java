package ifelse.asel;

import java.util.Scanner;

public class IfElseAllExamples {
    public static void main(String[] args) {

        String kg = "Kyrgyzstan";
        if (kg.equals("Kyrgyzstan")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
/// /////////////////////////////////////////////////////////////////////////
        boolean de = true;
        if (de) {
            System.out.println("Germany");
        } else {
            System.out.println("Kyrgyzstan");
        }

        /// ////////////////////////////////////////////////////////////////////

        int age = 16;
        if (age >= 18) {
            System.out.println("You are adult");
        } else {
            System.out.println("You are minor");
        }

        /// //////////////////////////////////////////////////////////////////////

        int age2;
        age2 = 15;

        boolean isAdult = true;

        if (age2 >= 18) {
            isAdult = true;
            System.out.println(isAdult);
        } else {
            isAdult = false;
            System.out.println(isAdult);
        }

        /// /////////////////////////////////////////////////////////////////////////
        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you? ");
        int age3 = sc.nextInt();

        if (age3 <= 6) {
            if (age3 <= 6 && age3 >= 3) {
                System.out.println("You go to kindergarden");
            } else {
                System.out.println("You sit with your mom");
            }
        } else if (age3 >= 6 && age3 <=17) {
            if (age3 >= 6 && age3 <= 10) {
                System.out.println("You go to elementary school");
            } else if (age3 >= 10 && age3 <= 14) {
                System.out.println("You go to middle school");
            } else if (age3 >= 10 && age3 <= 18) {
                System.out.println("You go to high school");
            }
        } else {
            System.out.println("You go to university");
        }

/// ///////////////////////////////////////////////////////////////////////////////////

        // HOMEWORK 1:

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the temp in your city: ");
        int temp = sc2.nextInt();

        if (temp > 30) {
            System.out.println("The weather is hot, wear light clothes");
        } else if (temp <= 0) {
            System.out.println("It's cold in the outside. Put on warm clothes");
        } else if (temp >0 && temp <30 ) {
            System.out.println("It's warm in the outside. Put on usual clothes");
        }


        // HOMEWORK 2:

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter your score: ");
        int score = sc3.nextInt();
        if (score >= 90 && score <= 100) {
            System.out.println("You get 5");
        }else if (score >= 70 && score <= 89) {
            System.out.println("You get 4");
        }else if (score >= 50 && score <= 69) {
            System.out.println("You get 3");
        }else if (score >= 0 && score <= 49) {
            System.out.println("You get 2");
        }else {
            System.out.println("Undefined score");
        }

        //////////////////////////////////////////////////////////
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day = sc4.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Undefined day");
                break;
        }

        // HOMEWORK 1: switch case

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Press number 1 to calculate.");
        System.out.println("Press number 2 to see the list of the courses.");
        System.out.println("Press number 3 to quit..");
        System.out.println("Enter the number: ");
        int number = sc5.nextInt();

        switch (number) {
            case 1:
                System.out.println("We are calculating.");
                break;
            case 2:
                System.out.println("List of the courses.");
                break;
            case 3:
                System.out.println("Quit.");
                break;
            default:
                System.out.println("Undefined number");
                break;
        }

    }
}
