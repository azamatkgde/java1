package arrays.gulira;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] numbers = {
                {71, 28, 34},
                {54, 56, 68},
                {75, 78, 98}
        };

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];

            }

            System.out.println("Жалпы элементтердин суммасы: " + sum);
        }
    }
}
