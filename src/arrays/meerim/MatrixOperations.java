package arrays.meerim;

import arrays.meerim.Utility;

public class MatrixOperations {
    public static void main(String[] args) {
        // Колдонуучудан өлчөмдөрдү алуу
        int n1 = Utility.chiediInt("Enter the number of rows:");
        int n2 = Utility.chiediInt("Enter the number of columns:");

        // Матрицаны түзүп, толтуруу
        int[][] arr = matrix(n1, n2);

        // Матрицаны экранга чыгаруу
        System.out.println("Matrix:");
        printMatrix(arr);
    }

    // Матрицаны толтурган метод
    private static int[][] matrix(int n1, int n2) {
        int[][] arr = new int[n1][n2];

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                arr[i][j] = Utility.chiediInt("Element [" + i + "][" + j + "]:");
            }
        }

        return arr;
    }

    // Матрицаны басып чыгаруу
    private static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
