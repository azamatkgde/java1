package arrays.aibek;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size ;

        do {
            System.out.println("Массивдин узундугун киргизиниз (5-10 го чейинки сан): ") ;
            size = scanner.nextInt();
        }while (size <5 || size >10);
        int [] numbers = new int[size ] ;

        System.out.println("Массивге " +  size + " сан киргизилди: ");
        for (int i = 0; i < size ; i++){
            System.out.println("Элемент " + i + ": ") ;
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Сиз киргизген массив: ") ;
        for (int i= 0; i < size ; i ++){
            System.out.println("numbers["+ i + "] = " + numbers[i ]);
        }

    }
}
