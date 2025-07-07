package ifelse.meerim;

import java.util.Scanner;

public class ConditionChecker {
    public static void main(String[] args) {

        checker();
        point();
        switcher();
        menu();

    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);

        while (true) {  // түбөлүк цикл
            System.out.println("\n Менюну тандаңыз: \n" +
                    " бир - Калькулятор \n" +
                    " эки - Курстар тизмеси \n" +
                    " үч - Чыгуу");

            String choice = sc.nextLine().toLowerCase();  // киргизилген жообу кичине тамгаларга келтиребиз

            switch (choice) {
                case "бир":
                    System.out.println("Калькулятор:");
                    Calculator.calculate();  // Калькуляторду иштетүү
                    break;
                case "эки":
                    System.out.println("Курстар тизмеси:");
                    CoursesList.showCourses();  // Курстарды көрсөтүү
                    break;
                case "үч":
                    System.out.println("Программа жабылды. Кош болуңуз!");
                    return;  // методду токтотуп, программа токтоп калат
                default:
                    System.out.println("Туура эмес тандоо. Сураныч, кайра тандаңыз.");
            }

            System.out.println("---------------------------------------------------------------");
        }
    }

    private static void switcher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, select a day:");
        String dayString = sc.nextLine();

        int day;
        try {
            day = Integer.parseInt( dayString );
        }catch(NumberFormatException e){
            System.out.println("Invalid input!Please enter a number");
            return;
        }

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
                case 2:
                    ;System.out.println("Tuesday");
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
                System.out.println("Choose not valid");

        }
        System.out.println("You selected: " + day);
        System.out.println("------------------------------------------------------------------");
    }


    private static void point() {
        Scanner s = new Scanner(System.in);
        System.out.println("Your point between 0 and 100:");
        int point = s.nextInt();
        if(point > 90 &&  point <= 100){
            System.out.println("5");
        } else if (point > 70 && point <= 89) {
            System.out.println( "4" );
        }else if(point > 50 && point <= 69) {
            System.out.println("3");
        } else if (point == 0 && point <= 49) {
            System.out.println("2");
        }
       // System.out.println(point);
        System.out.println("-----------------------------------------------------------------");
    }

    private static void checker() {
        Scanner s = new Scanner(System.in);
        System.out.print("Температураны киргизиңиз: ");
        int temp = s.nextInt();

        if (temp > 30) {
            System.out.println("Температура ысык.");
        } else if (temp >= 0 && temp <= 30) {
            System.out.println("Температура нормалдуу.");
        } else {
            System.out.println("Температура муздак.");
        }
    }

}
