package arrays.askar;

import java.util.Arrays;

public class ArraysExample  {
    public static void main(String[] args) {
        int[] nums = {8, 2, 5, 3, 1, 9};
        System.out.println("Исходный массив: " + Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println("После сортировки: " + Arrays.toString(nums));

         int pos = Arrays.binarySearch(nums, 5);
         System.out.println("Индекс элемента 5: " + pos);

    }
}
