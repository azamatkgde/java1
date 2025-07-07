package variable.mirlan;

import java.util.Scanner;

public class variable {
    public static  void main(String[] args) {

        // Озгормолорду тузуу
        String name = "Mirlan Narynbek Uulu";
        System.out.println("Name:" + name);
        int age = 41;
        System.out.println("Age:" + age);
        double weight = 80.5;
        System.out.println("Weight:" + weight);
        boolean isFat = true;
        System.out.println("Fat:" + isFat);
        boolean isTall = false;
        System.out.println("Tall:" + isTall);
        long salary = 60000;
        System.out.println("Salary:" + salary);
        short hour = 24;
        System.out.println("Hour:" + hour);
        byte minute = 60;
        System.out.println("Minute:" + minute);

        //Арифметикалык операциялар

        int x = 80;
        int y = 40;

        System.out.println("Arithmetic operations (x = 80, y = 40):");
        System.out.println("x + y=" + (x + y));
        System.out.println("x - y=" + (x - y));
        System.out.println("x * y=" + (x * y));
        System.out.println("x / y=" + (x / y));
        System.out.println("the end");

        // Типтердин MAXын чыгаруу
        System.out.println("\n-------MAX value--------");
        System.out.println("byte:" + Byte.MAX_VALUE);
        System.out.println("short:" + Short.MAX_VALUE);
        System.out.println("int:" + Integer.MAX_VALUE);
        System.out.println("long:" + Long.MAX_VALUE);
        System.out.println("float:" + Float.MAX_VALUE);
        System.out.println("double:" +Double.MAX_VALUE);
        System.out.println("char:" + Character.MAX_VALUE);


        System.out.println("\n-------Age Check----");
        Scanner scunner = new Scanner(System.in);
        System.out.println("Enter your age:");

        int userAge = scunner.nextInt();
        // if/else колдонуу
        if (userAge < 40) {
            System.out.println(name + "Чон адам жашоону тушунуп калган");
        } else {
            System.out.println(name + "Жашоого коз карашы толук жете элек ");
        }

    }

}


























