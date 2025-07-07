package arrays.zhanna;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        // Узундукту 5тен 10го чейин алуу
        do {
            System.out.print("Массивдин узундугун киргизиңиз (5–10): ");
            size = scanner.nextInt();
        } while (size < 5 || size > 10);

        int[] numbers = new int[size];

        // Массивди колдонуучудан толтуруу
        for (int i = 0; i < size; i++) {
            System.out.print((i + 1) + "-санды киргизиңиз: ");
            numbers[i] = scanner.nextInt();
        }

        // Сумма, min жана max табуу
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] < min) {
                min = numbers[i];
            }

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        double average = (double) sum / numbers.length;

        // Натыйжаларды чыгаруу
        System.out.println("\nЖыйынтык:");

        System.out.println("Суммасы: " + sum);
        System.out.println(Arrays.toString(numbers));
        System.out.println("Орточо мааниси: " + average);
        System.out.println("Минималдуу мааниси (min): " + min);
        System.out.println("Максималдуу мааниси (max): " + max);

        scanner.close();
    }
}
