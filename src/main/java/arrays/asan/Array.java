package arrays.asan;

import java.util.Arrays;
import java.util.Scanner;


public class Array {
    public static void main(String[] args){
        int [] array = new int[]{12,32,15,78,43,2,67,};

        Arrays.sort(array);
        System.out.println("Сорттолгондон кийин: " + Arrays.toString(array));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Издеген санды киргиз");
        int array1 = scanner.nextInt();

        int array2 = Arrays.binarySearch(array,array1);

        if (array2 >= 0) {
            System.out.println("Бул сан массивде бар " + array1 + " , индекси " + array2);
        }
        else {
            System.out.println(array1 + "индекси жок");

        }

    }


}

