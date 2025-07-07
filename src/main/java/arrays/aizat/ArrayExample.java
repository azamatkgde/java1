package arrays.aizat;
import java.util.Arrays;
public class ArrayExample {
    public static void main(String[] args){
        // 1. Массивди жарыялоо (узун форма)
        int[] numbers;
        numbers = new int[5];

        // 2. Кыска формада жарыялоо жана инициализациялоо
        numbers = new int[]{10, 20, 30, 40, 50};

        // 3. Элементтерге жетүү
        System.out.println("Биринчи элемент: " + numbers[0]);
        System.out.println("Экинчи элемент: " + numbers[1]);

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
