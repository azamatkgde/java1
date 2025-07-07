package arrays.yryskeldi;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class SortAndSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 10 элементтүү массив түзүү
        int[] numbers = new int[10];

        // Массивди random сандар менен толтуруу (1–100)
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1; // 1–100
        }

        // Толтурулган массивди көрсөтүү
        System.out.println("Баштапкы массив:");
        System.out.println(Arrays.toString(numbers));

        // Массивди сорттоо
        Arrays.sort(numbers);
        System.out.println("Сорттолгон массив:");
        System.out.println(Arrays.toString(numbers));

        // Колдонуучудан издөө үчүн сан алуу
        System.out.print("Кайсы санды издейсиз? ");
        int target = scanner.nextInt();

        // Издөө жүргүзүү
        int index = Arrays.binarySearch(numbers, target);

        // Натыйжаны чыгаруу
        if (index >= 0) {
            System.out.println("Сан табылды! Индекси: " + index);
        } else {
            System.out.println("Бул сан массивде жок.");
        }

        scanner.close();
    }
}
