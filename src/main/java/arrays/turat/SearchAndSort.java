package arrays.turat;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SearchAndSort {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random rand = new Random();

        // Массивди 1ден 100гө чейинки random сандар менен толтуруу
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Баштапкы массив:");
        System.out.println(Arrays.toString(numbers));

        // Массивди сорттоо
        Arrays.sort(numbers);
        System.out.println("Сорттолгон массив:");
        System.out.println(Arrays.toString(numbers));

        // Колдонуучудан сан суроо
        Scanner scanner = new Scanner(System.in);
        System.out.print("Издөөгө сан киргизиңиз: ");
        int searchValue = scanner.nextInt();

        // Сан издөө
        int result = Arrays.binarySearch(numbers, searchValue);

        if (result >= 0) {
            System.out.println("Сан табылды! Индекси: " + result);
        } else {
            System.out.println("Кечиресиз, бул сан массивде жок.");
        }
    }
}
