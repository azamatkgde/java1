package oop.meerim;

import java.util.Date;
import java.util.Scanner;

public class PersonTest1{
    public static void main(String[] args) {
        Person p1 = new Person();

        String name = AskString("Insert name");

        String lastName = AskString("Insert lastname");

        String inn = AskString("Insert inn");

        int day = AskInt("Insert date of birthday");
        int month = AskInt("Insert month of birthday");
        int year = AskInt("insert year of birthday");

        p1.setName(name);
        System.out.println(p1.getName());

        p1.setLastName(lastName);
        System.out.println(p1.getLastName());

        p1.setInn(inn);
        System.out.println(p1.getInn());

        System.out.println(" Ciao, i am : " + name + " " + lastName);
        Date d = new Date();
        d.setYear(year - 1900);
        d.setMonth(month - 1);
        d.setDate(day);

        System.out.format("Birthday is  %d/%d/%d \n ", d.getDate(), d.getMonth() + 1, d.getYear() + 1900);

        Date now = new Date();

        int age  = now.getYear() - d.getYear();
        System.out.println( "Now age is :" + age);
    }

    private static int AskInt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        int input = scanner.nextInt();
        return input;
    }

    private static String AskString(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String input = scanner.nextLine();

        return input;
    }

}