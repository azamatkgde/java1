package variable.muslim;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        // Анкета (String, int, boolean)
        String name = "Muslim Said";
        int age = 28; // Биринчи аныкталган age
        double height = 1.70;
        float weight = 65.5f;
        double salary = 1500.50;
        boolean isMarried = true;
        boolean isTeacher = true;
        boolean isStudent = false;
        long population = 1000000L; // population of a city
        short year = 1997;
        byte level = 1;
        char gender = 'M';

        // Non-primitive types
        String company = "Elmus";
        int[] numbers = {1, 2, 3};
        String[] branches = {"IT group.kg", "Edume.kg", "Marketing.kg"};

        // Анкета маалыматтарын чыгарат
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Salary: " + salary);
        System.out.println("Married: " + isMarried);
        System.out.println("Teacher: " + isTeacher);
        System.out.println("Student: " + isStudent);
        System.out.println("Population: " + population);
        System.out.println("Year: " + year);
        System.out.println("Level: " + level);
        System.out.println("Gender: " + gender);

        // Non-primitive types
        System.out.println("\n--- Non-primitive types ---");
        System.out.println("Company: " + company);
        System.out.println("Numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println("Branches:");
        for (String branch : branches) {
            System.out.println(branch);
        }

        // Примитивдик типтердин MAX_VALUE өзүмө түшүктүү болсун деп жаздым primitive types
        System.out.println("\n--- Max Values ---");
        System.out.println("Byte MAX: " + Byte.MAX_VALUE);
        System.out.println("Short MAX: " + Short.MAX_VALUE);
        System.out.println("Int MAX: " + Integer.MAX_VALUE);
        System.out.println("Long MAX: " + Long.MAX_VALUE);

        // Arithmetic operations Арифметикалык операциялар
        int a = 15;
        int b = 4;

        System.out.println("\n--- Arithmetic Operations ---");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Логикалык шарт (if/else жаш курагы боюнча)
        System.out.println("\n--- Age Check ---");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");

        // age айнымалысын кайра аныктап жатпайбыз
        int userAge = scanner.nextInt(); // Бул жерде жаңы айнымалы түздүк

        // age менен салыштыруу
        if (userAge < 18) {
            System.out.println(name + " is a minor.");
        } else {
            System.out.println(name + " is an adult.");
        }

        // Scanner'ди жабабыз
        scanner.close();
    }
}
