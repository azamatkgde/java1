package arrays.turat;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;

        // Массив узундугун сурайбыз
        do {
            System.out.print("Массивдин узундугун жазыңыз (5тен 10го чейин): ");
            size = input.nextInt();
        } while (size < 5 || size > 10);

        int[] numbers = new int[size];
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Массивди толтуруу жана эсептөө
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + "-санды жазыңыз: ");
            numbers[i] = input.nextInt();

            sum += numbers[i];

            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
        }

        double average = (double) sum / size;

        // Натыйжалар
        System.out.println("\n✅ Сиз жазган сандар:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\n\n📊 Жыйынтык:");
        System.out.println("Суммасы: " + sum);
        System.out.println("Орточо мааниси: " + average);
        System.out.println("Эң чоңу: " + max);
        System.out.println("Эң кичинеси: " + min);
    }
}
