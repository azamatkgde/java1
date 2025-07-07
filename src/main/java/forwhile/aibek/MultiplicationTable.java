package forwhile.aibek;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );

        System.out.println("Сан киргизиниз: ") ;

        int number = scanner.nextInt();
        System.out.println("\nКобойтуу таблицасы: ");
        for(int n =1 ; n<=20 ;n++ ) {
            System.out.println(number + "*"+ n + "=" + (number * n ));
        }
        scanner.close() ;
    }
}
