package arrays.aizat;
import java.util.Scanner;
public class ArrayHomework21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Массив канча элементтен турушу керек? (Мисалы 5тен жогору 10дон аз элемент(сан) жазыныз): ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        int sum = 0;

        System.out.println("Сандарды киргизиңиз(ар бир санды жаны строчкага жазыныз):");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            sum = sum + array[i];
        }

        System.out.println("Бул сандардын суммасы: " + sum);
        System.out.println("Орточо мааниси: " + (sum / (double) size));

        scanner.close();



        //Мин/Макс табуу:
        System.out.println("Ушул жерден биринчи тапшырманын экинчи болугу башталат(Мин/Макс табуу)");
        int[] numbers = {4, 7, 2, 5, 8};
        System.out.println("Бизде ушундай массивтин мин/максы бар {4, 7, 2, 5, 8}");
        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }


        System.out.println("Минималдуу маани: " + min);
        System.out.println("Максималдуу маани: " + max);



    }
}
