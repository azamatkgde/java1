package ifelse.azamat.gulira;

import  java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Эшикте аба ырайы кандай экен?");
        int temperature = scanner.nextInt();
        if (temperature < 0) {
            System.out.println("Бүгүн суук экен. Калыңыраак кийин.");
        } else if (temperature <= 20) {
            System.out.println("Жылуу экен. Жеңил эле куртка кий.");
        } else {
            System.out.println("Эшик ысык. Футболка эле кий");
        }

        // Баалоо системасы

        System.out.println("Сынактан канча алдың?");
        float score = scanner.nextFloat();
        if (score >= 90 && score <= 100) {
            System.out.println("Сынактан 5 (эң жакшы) алдым");
        } else if (score >= 70 && score <= 89) {
            System.out.println("Сынактан 4 (жакшы) алдым");
        } else if (score >= 50 && score <= 69) {
            System.out.println("Сынактан 3 (орто) алдым");
        } else if (score >= 0 && score <= 49) {
            System.out.println("Сынактан 2 (канааттандыраарлык) алдым");
        } else {
            System.out.println("Ката!: 0 дон 100 гө чейинки гана санды жазыңыз!");
        }
        scanner.close();


    }
}
