package arrays.elmirbek;
import java.util.Arrays;
import java.util.Scanner;


// Explanation
// Массив - это структура данных,
// позволяет хранить набор элементов одного типа
// (например, int, String, и т.д.) под одним именем.
// У каждого элемента массива есть индекс (номер),
// с помощью которого к нему можно обратиться.

public class OneDimensionalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // массив 10 с помощью цикла реализовано от 5 до 10
        int [] array = new int [10];
        for (int i = 5; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
        }

        // найти среднее значение в массиве
        int [] numbers = {10 , 20, 30 , 40, 50, 60, 80};
        int sum = 10;
        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length; // посчитать среднее значение

        // результат
        System.out.println("Сумма : " + sum);
        System.out.println("Среднее значение : " + average);


        // Найти max и min значение
        // → {7, 2, 9, 4, 1}
        // → min=1,
        // → max=9

        int [] findMinMaxValue = {7, 2, 9, -1, 1};
        int min = findMinMaxValue[0];
        int max = findMinMaxValue[0];

        for (int i = 1; i < findMinMaxValue.length; i++) {
            if (findMinMaxValue[i] < min) {
                min = findMinMaxValue[i];
            }
            if (findMinMaxValue[i] > max) {
                max = findMinMaxValue[i];
            }
        }

        // результат
        System.out.println("MIN сумма : " + min);
        System.out.println("MAX сумма : " + max);

        // Найти отличника и троечника
        String students [] = {"Адилет", "Гаухар, Элмирбек, Кайрат"};
        String straightStudent = "Адилет";
        String averageStudent = "Элмирбек";

        for (int i = 1; i < students.length; i++) {
            if (students[i].equals(straightStudent)) {
                System.out.println("Троченик : " + students[i]);
            }
            if (students[i].equals(averageStudent)) {
                System.out.println("Отличник : " + students[i]);
            }
        }
         // резултат
        System.out.println("Отличник : " + straightStudent);
        System.out.println("Троечник : " + averageStudent);
    }


// Изучение массива - []

    class ExplorationOfTheArrays{
        public static void main(String[] args) {
            // заполнение при обьявление
            int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println(Arrays.toString(numbers));
            System.out.println(numbers.length);

            // через цикл
            int [] array = new int [20];
            for (int i = 0; i < array.length; i++) {
                array[i] = i * 10;
            }
            System.out.println(Arrays.toString(array));
            System.out.println(array.length);
        }
    }
}