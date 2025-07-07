package forwhile.aibek;

import java.util.Scanner;

public class ForWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int number;
        //Цикл 0 дон башка сан киргизилде гана иштейт
        do {System.out.println("Сан киргизиниз (чыгуу учун 0 ): ") ;
            number = scanner.nextInt();
            if (number != 0){
                System.out.println("Киргизилген сан: " + number ) ;
            }

        }while (number != 0);
        System.out.println("Цикл аяктады!!!");

        scanner.close() ;
    }
}
