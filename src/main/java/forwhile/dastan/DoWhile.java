package forwhile.dastan;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int number;
        do {System.out.println("Сан жазыныз (чыгуу учун 0 санын жазыныз ): ") ;
            number = scanner.nextInt();
            if (number != 0){
                System.out.println("Жазылган сан: " + number ) ;
            }
        }while (number != 0);
        System.out.println("Цикл аяктады!!!");

        scanner.close() ;
    }
}
