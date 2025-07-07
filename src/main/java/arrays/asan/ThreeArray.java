package arrays.asan;

import java.util.Arrays;
import java.util.Scanner;

public class ThreeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] nummers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8,}
        };
        int sum = 0;
        for (int i = 0; i < nummers.length; i++) {
            for (int j = 0; j < nummers[i].length; j++) {
                sum += nummers[i][j];
            }
        }
        System.out.println("" + sum);
    }
    }



