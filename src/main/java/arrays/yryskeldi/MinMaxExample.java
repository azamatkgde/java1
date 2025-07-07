package arrays.yryskeldi;

public class MinMaxExample {
    public static void main(String[] args) {
        int[] numbers = {7, 2, 9, 4, 1};
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
        System.out.println("Эң кичине мааниси (min): " + min);
        System.out.println("Эң чоң мааниси (max): " + max);
    }
}
