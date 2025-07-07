package arrays.gulira;

import java.util.Arrays;

public class ArraysMetod {
    public static void main (String[] args){
        int [] nums = {87, 34, 89, 34, 23, 34, 56, 23, 78, 34};
        System.out.println("Баштапкы массив: " + Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println("Сорттолгондон кийин: " + Arrays.toString(nums));

        int pos = Arrays.binarySearch(nums, 5);
        System.out.println("5-элементтин индекси: " +pos);


    }
}
