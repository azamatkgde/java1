package arrays.zhanna;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class ArraysMethods {
    // Массивдеги эң чоң маанини табуучу метод
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Массивдеги эң кичине маанини табуучу метод
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 10 элементтен турган массив түзүү
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1; // 1ден 100гө чейин random сан
        }

        // Массивди экранга чыгаруу
        System.out.println("Массивдин баштапкы көрүнүшү:");
        System.out.println(Arrays.toString(numbers));

        // Массивди сорттоо
        Arrays.sort(numbers);
        System.out.println("\nСорттолгон массив:");
        System.out.println(Arrays.toString(numbers));

        // Колдонуучудан сан сурап, анын позициясын табуу
        System.out.print("\nСан киргизиңиз (1ден 100гө чейин): ");
        int target = scanner.nextInt();

        int position = Arrays.binarySearch(numbers, target);
        if (position >= 0) {
            System.out.println("Сан табылды, позиция: " + position);
        } else {
            System.out.println("Сан табылган жок.");
        }

        // Эң чоң жана эң кичине маанилерди табуу
        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println("\nЭң чоң мааниси: " + max);
        System.out.println("Эң кичине мааниси: " + min);

        scanner.close();
    }
}
