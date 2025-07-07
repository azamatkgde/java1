package arrays.askar;
import java.util.Arrays;

class OneArrays {
    public static void main(String[] args) {
        // 1. Массивди жарыялоо (узун форма)
        int[] numbers;
        numbers = new int[5];

        // 2. Кыска формада жарыялоо жана инициализациялоо
        numbers = new int[]{10, 20, 30, 40, 50};

        int[] team;
        team = new int[] {1,2,3,4,5,6,7,8,};
        // 3. Элементтерге жетүү
        System.out.println("Barcelona: " + team[1]);
        System.out.println("Real Madrid: " + team[2]);

        // 4. Массивдин узундугун алуу
        System.out.println("Массивдин узундугу: " + numbers.length);

        // 5. Массивди толугу менен чыгаруу
        System.out.println("Numbers массиви: " + Arrays.toString(numbers));

        // 6. Цикл менен массивдин элементтерин чыгарып берүү
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Элемент №" + i + " = " + numbers[i]);
        }
    }
}