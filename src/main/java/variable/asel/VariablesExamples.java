package variable.asel;

import java.util.Scanner;

public class VariablesExamples {
    public static void main(String[] args) {
        String name = "Asel";

        System.out.println("My name is " + name);
        int age = 29;
        System.out.println("I'm " + age + " years old");

        double dollars = 2.99;
        System.out.println("Apple costs " + dollars + " dollars");

        boolean isTeacher = true;
        System.out.println("Am I a teacher? " + isTeacher);

        System.out.println("Max value of integer = " + Integer.MAX_VALUE);
        System.out.println("Min value of integer = " + Integer.MIN_VALUE);
        System.out.println("Max value of byte = " + Byte.MAX_VALUE);
        System.out.println("Min value of byte = " + Byte.MIN_VALUE);

        int groupA = 15;
        int groupB = 14;
        System.out.println("We have " + (groupA + groupB) +" students");
        System.out.println("Difference between group A and group B is: " + (groupA - groupB));

        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you? ");
        int oldAge = sc.nextInt();
        System.out.println("You are " + oldAge);
        System.out.println("Our difference is " + (age - oldAge) + " years");
    }
}
