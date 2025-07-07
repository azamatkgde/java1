package arrays.zhanna;

import java.util.Scanner;

public class ArraysIJ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Колдонуучудан өлчөмдөрдү алуу
        System.out.print("Катарлардын санын киргизиңиз: ");
        int rows = scanner.nextInt();

        System.out.print("Тилкелердин санын киргизиңиз: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Матрицаны толтуруу
        System.out.println("Матрицанын элементтерин киргизиңиз:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Матрицаны экранга чыгаруу
        System.out.println("\nМатрица:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Бардык элементтердин суммасын эсептөө
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("\nМатрицанын элементтеринин суммасы: " + sum);

        scanner.close();
    }
}
