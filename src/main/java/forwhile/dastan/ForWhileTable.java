package forwhile.dastan;

import java.util.Scanner;

public class ForWhileTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );

        System.out.println("Сан киргизиниз: ") ;

        int number = scanner.nextInt();
        System.out.println("\nКобойтуу таблицасы: ");
        for(int n =1 ; n<=10 ;n++ ) {
            System.out.println(number + "*"+ n + "=" + (number * n ));
        }
        scanner.close() ;
    }
}
