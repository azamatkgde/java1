package arrays.yryskeldi;

public class MinMaxFunctions {
    public static void main(String[] args) {
        // Массив мисалы
        int[] numbers = {14, 7, 22, 3, 18, 9};

        // Методдорду чакыруу
        int max = findMax(numbers);
        int min = findMin(numbers);

        // Натыйжаларды чыгаруу
        System.out.println("Эң чоң мааниси: " + max);
        System.out.println("Эң кичине мааниси: " + min);
    }

    // Эң чоң маанини табуучу метод
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Эң кичине маанини табуучу метод
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
