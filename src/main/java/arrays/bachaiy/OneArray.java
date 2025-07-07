package arrays.bachaiy;

import java.util.Arrays;

    public class OneArray {
        public static void main(String[] args) {
            int[] numbers;
            numbers = new int[]{10, 20, 30, 40, 50};
            System.out.println("First Element: " + numbers[0]);
            System.out.println("Second Element: " + numbers[1]);

            System.out.println("Array length: " + numbers.length);
            System.out.println("Numbers Array: " + Arrays.toString(numbers));
            for (int i = 0; i < numbers.length; i++) {
                System.out.println("Element №" + i + "=" + numbers[i]);
            }
        }
    }
