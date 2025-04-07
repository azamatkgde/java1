package arrays.aelita;

import java.util.Arrays;

public class OneArrays {
    public static void main(String[] args) {
        int[][] m = {{1, 2}, {3, 4}};
        int sum = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
        }

        System.out.println("Сумма элементов матрицы: " + sum);
    }
}

