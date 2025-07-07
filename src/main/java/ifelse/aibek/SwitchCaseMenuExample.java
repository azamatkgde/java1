package ifelse.aibek;

import java.util.Scanner;

public class SwitchCaseMenuExample {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in );
    System.out.println("Меню тандап алуу: ") ;
    System.out.println("1 - Калькуляторго отуу") ;
    System.out.println("2 - Курстардын тизмесин коруу") ;
    System.out.println("3 - Чыгуу") ;
    System.out.println("Тандоонузду киргизиниз") ;

    int choise = scanner.nextInt();

    switch (choise ){
        case 1:
            // калькулятор
            System.out.println(" Биринчи сан: ") ;
            double num1 = scanner.nextDouble();

            System.out.println(" Экинчи сан: ") ;
            double num2 = scanner.nextDouble();

            System.out.println("Операцияны танданыз (+,-,*,/): ") ;
            char operator = scanner.next().charAt(0) ;

            double result;
            switch (operator ) {
                case '+':
                    result = num1 + num2 ;
                    System.out.println("Жыйынтык: " + result  );
                    break;
                case '-':
                    result = num1 - num2 ;
                    System.out.println("Жыйынтык: " + result  );
                    break;
                case '*':
                    result = num1 * num2 ;
                    System.out.println("Жыйынтык: " + result  );
                    break;
                case '/':
                    if (num2 != 0){
                        result = num1 / num2 ;
                        System.out.println("Жыйынтык: " + result  );
                    }else {
                        System.out.println("Нолго болууго болбойт! ");
                    }
                    break;
                default : System.out.println("Белгисиз операция!") ;

            }
            break;



        case 2:

            System.out.println("Курстардын тизмесин коруу") ;
            break;
        case 3:
            System.out.println("Программа жабылды") ;
            break;
        default: System.out.println("Белгисиз буйрук") ;

    }

 }
}
