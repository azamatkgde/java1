package arrays.turat;

import java.util.Scanner;

public class MultiDimensionalArrayTurat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Өлчөмдөрдү суроо
        System.out.print("Матрицанын катар (row) санын киргизиңиз (2 ден 5 чейин гана): ");
        int rows = scanner.nextInt();

        System.out.print("Матрицанын тилке (column) санын киргизиңиз (1 ден 8 ге чейин):");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Матрицаны толтуруу
        System.out.println("\nМатрицанын элементтерин киргизиңиз:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Матрицаны чыгаруу
        System.out.println("\nСиз киргизген матрица:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); // жаңы сап
        }
    }
}

 /* class ArraysExample {
    public static void main(String[] args) {
        int[] nums = {8, 2, 5, 1, 9};
        System.out.println("Баштапкы массив: " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("Сорттолгондон кийин: " + Arrays.toString(nums));
        int pos = Arrays.binarySearch(nums, 5);
        System.out.println("5 деген элементтин индекси: " + pos);
    }}
*/

