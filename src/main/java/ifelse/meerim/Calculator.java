package ifelse.meerim;

import java.util.Scanner;

public class Calculator {
    public static void calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Биринчи санды киргизиңиз:");
        double num = sc.nextDouble();
        System.out.println("Амалды тандаңыз (+, -, *, /, %):");
        char operator = sc.next().charAt(0);
        System.out.println("Экинчи санды киргизиңиз:");
        double num1 = sc.nextDouble();

        double result = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = num + num1;
                break;
            case '-':
                result = num - num1;
                break;
            case '*':
                result = num * num1;
                break;
            case '/':
                if (num1 != 0) {
                    result = num / num1;
                } else {
                    System.out.println("Ката! Нөлгө бөлүүгө болбойт.");
                    valid = false;
                }
                break;
            case '%':
                result = num % num1;
                break;
            default:
                System.out.println("Туура эмес амал тандалды.");
                valid = false;
        }

        if (valid) {
            System.out.println("Жыйынтык: " + result);
        }
    }
}