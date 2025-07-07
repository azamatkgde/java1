package arrays.asan;

import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.Scanner;

public class ZweiArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nummers1 = new int[7];


        System.out.println("7 элементке орун беруу");

        for (int i = 0; i < nummers1.length; i++) {
            nummers1[i] = scanner.nextInt();
        }


        System.out.println("Массивдин узундугу" + Arrays.stream(nummers1).sum());

  // экинчи задания2
    int min = nummers1[0];
    int max = nummers1[0];

    for (int i = 0; i < nummers1.length; i++){
        if (nummers1[i] < min) min = nummers1[i];
        if (nummers1[i] > max) max = nummers1[i];
    }
        System.out.println("Минималдуу сан: " + min);
        System.out.println("Максималдуу сан: " + max);

    //for (int i = 0; i < nummers1.length; i++) {
    //System.out.println("Элемент № " + i + "=" + nummers1[i]);


        scanner.close();
    }
}


