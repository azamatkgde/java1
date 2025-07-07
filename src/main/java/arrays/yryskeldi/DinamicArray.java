package arrays.yryskeldi;
import java.util.Scanner;
public class DinamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Колдонуучудан массивдин узундугун сурайбыз
        System.out.print("Массивдин узундугун киргизиңиз (5–10): ");
        int length = scanner.nextInt();

        // Текшерүү: 5–10 аралыгындабы?
        if (length < 5 || length > 10) {
            System.out.println("Сиз 5тен кем же 10дон көп сан киргиздиңиз. Программа токтоду.");
            return; // Программа токтойт
        }

        int[] numbers = new int[length]; // Берилген узундуктагы массив

        // Массивди толтуруу
        System.out.println("Массивге " + length + " сан киргизиңиз:");
        for (int i = 0; i < length; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Сумма жана орточо маанини эсептөө
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / length;

        // Натыйжаны чыгаруу
        System.out.println("Суммасы: " + sum);
        System.out.println("Орточо мааниси: " + average);

        scanner.close();
    }
}
