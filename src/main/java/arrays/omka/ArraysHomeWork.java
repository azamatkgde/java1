package arrays.omka;
import java.util.Arrays;
public class ArraysHomeWork {
        public static void main(String[] args) {
            int[] numbers = new int[5];
            numbers = new int[]{10, 20, 30, 40, 50};

            System.out.println("Первый элемент: " + numbers[0]);
            System.out.println("Второй элемент: " + numbers[1]);
            System.out.println("Длина массива: " + numbers.length);
            System.out.println("Массив numbers: " + Arrays.toString(numbers));
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Элемент номер " + i + " = " + numbers[i]);
            }



            int [] num = {3, 6, 15, 89, 65, 14};
            int max = num [0];
            int min = num [0];
            for (int i = 1; i < num.length; i++) {
                if (num[i] > max) {
                    max = num[i];
                }
            }
            for (int i = 1; i < numbers.length; i++) {
                if (num[i] < min) {
                    min = num[i];
                }
            }
            System.out.println("Максимальное значение: " + max);
            System.out.println("Минимальное значение: " + min);



            int sum = 0;
            for (int number : num) {
                sum += number;
            }
            System.out.println("Сумма элементов массива: " + sum);



            int [][] matrix = {
                    {1, 2, 3},
                    {4, 5 ,6},
                    {7, 8, 9}
            };
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + "  ");
                }
                System.out.println();
            }
        }
    }


