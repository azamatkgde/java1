package variable.dastan;

import java.util.Scanner;

public class variable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jash = 24;
        String name = "Dastan";
        String work = "Оператор";
        System.out.println("Салам менин атым " + name + " " + jash + " жаштамын " + work + " болуп иштеймин");

        System.out.println(" ");
        System.out.println("Типтердин MAX чыгаруу");
        System.out.println("byte: " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MAX_VALUE);
        System.out.println("Char: " + (int) Character.MAX_VALUE);


        int d = 24;
        int z = 22;
        System.out.println("Арифметикалык аперация (d = 24, z = 22):");

        System.out.println("d + z = " + (d + z));
        System.out.println("d - z = " + (d - z));
        System.out.println("d * z = " + (d * z));
        System.out.println("d / z = " + (d / z));
        System.out.println("d % z = " + (d % z));


        System.out.print(" Жашынызды жазыныз: ");
        int age = scanner.nextInt();


        if (age < 7) {
            System.out.println("Мектеп курагы!"); }
        if (age < 18) {
            System.out.println("Сиз студентсиз."); }
        if (age < 24) {
            System.out.println("Сиз чоң адамсыз. "); }
        if (age < 60) {
            System.out.println("Сиз пенсионерсиз.");
        } else {
            System.out.println("Сиз чон ата-энесиз.");
        }

    }
}

