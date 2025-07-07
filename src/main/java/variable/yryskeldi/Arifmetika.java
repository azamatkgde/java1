package variable.yryskeldi;
import  java.util.Scanner;
public class Arifmetika {
    public static  void  main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Биринчи санды жазыныз: ");
        int a = scanner.nextInt();

        System.out.print("Экинчи санды жазыныз: ");
        int b = scanner.nextInt();

        int num1 = a + b;
        int num2 = a - b;
        int num3 = a * b;
        int num4 = a / b;
        int num5 = a % b;

        System.out.println("\n Жыйынтыктары:");
        System.out.println("(a + b) = " + num1);
        System.out.println("(a - b) = " + num2);
        System.out.println("(a * b) = " + num3);
        System.out.println("(a / b) = " + num4);
        System.out.println("(a % b) =" + num5);
    }
}
