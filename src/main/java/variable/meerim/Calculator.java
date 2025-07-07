package variable.meerim;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your first number:");
        double num = sc.nextDouble();
        System.out.println("Insert  math operation( +, -, *, /, % ): ");
        char operator = sc.next().charAt(0);
        System.out.println("Insert your second number:");
        double num1 = sc.nextDouble();
        
        double result = 0;
        boolean valid = true;
        
         switch(operator){
           case '+' :
               result = num + num1;
               System.out.println("Resultat: " + result);
               break;
           case '-':
               result = num -num1;
               System.out.println("Resultat: " + result);
               break;
           case '*':
               result = num * num1;
               System.out.println("Resultat: " + result);
               break;
           case '/':
               if(  num1 != 0) {
                   result = num / num1;
               }else {
                   System.out.println( "Error!" );
                   valid = false;
               }
               break;
           case '%':
               result = num % num1;
               System.out.println("Resultat: " + result);
               break;
             default:
                 System.out.println("Not valid operation");
                 valid = false;
         }
         if (valid) {
             System.out.println( "Result: " + result );
         }   
         
    }
}
