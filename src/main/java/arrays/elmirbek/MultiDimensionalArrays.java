package arrays.elmirbek;
// Explanation
// Многомерный массив — это структура данных,
// которая хранит данные в виде таблицы,
// матрицы или более сложной формы.
// Проще говоря, это массив, внутри которого есть другие массивы.

import jdk.jshell.execution.Util;

import java.util.Scanner;

// [Задача - Көп өлчөмдүү массивдер]
public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // 2D [Матрицанын суммасын табуу]
        int[][] numbers = {
                {1, 2},
                {3, 4},
        };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
        }
        System.out.println("Сумма : " + sum);

        // [Матрицаны толтуруу]
        Scanner scanner = new Scanner(System.in);
        System.out.println("Катарлардын саны : ");
        int rows = scanner.nextInt();
        System.out.println("Тилкелердин санын : ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Матрицанын элементтерин киргизинис : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Элемент [" + i + "] [" + j + "] : ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\n Матрица : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}










