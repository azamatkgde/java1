package arrays.gulira;

public class MinMaxArray {
        public static void main(String[] args) {
            int[] numbers = {56, 76, 29, 54, 61};

            int min = numbers[0];
            int max = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            System.out.println("Минималдуу маани: " + min);
            System.out.println("Максималдуу маани: " + max);
        }
    }

