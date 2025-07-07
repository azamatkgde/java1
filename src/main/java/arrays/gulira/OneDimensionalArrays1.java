package arrays.gulira;

import java.util.Arrays;


public class OneDimensionalArrays1 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Биринчи элемент: " + numbers[0]);
        System.out.println("Экинчи элемент: " + numbers[1]);
        System.out.println("Бешинчи элемент: " + numbers[5]);

        System.out.println("Массивдин узундугу: " + numbers.length);

        System.out.println("Numbers массиви: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Элемент №" + i + " = " + numbers[i]);

        }
    }
}

