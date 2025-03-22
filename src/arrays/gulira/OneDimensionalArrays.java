package arrays.gulira;

import java.util.Scanner;


public class OneDimensionalArrays {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int size = 5;
            int[] numbers = new int[size];

            System.out.println(size + " сан жаз"   );
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }

            double average = (double) sum / size;

            System.out.println("Элементтердин суммасы: " + sum);
            System.out.println("Орточо эсеп: " + average);

            scanner.close();

        }

}