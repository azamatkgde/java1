package arrays.elmirbek;

// как работает массив с методами

// методы для массива

// Arrays.sort(array) ✅ - сортировка массива

// Arrays.toString(array) ✅ - преоброзвание массива в строку [Строковое представление массива, например: [1, 2, 3]] - для удобного отображение

// Arrays.equals(array1, array2) - сравнение массивов [Сравнение содержимого - boolean (true/false)]

// ArrayCopyOf(array, newLength) - копирование массива []

// Arrays.fill(array, value) - заполнение массива значением

// Arrays.binarySearch(array, key) - бинарный поиск (в отсортированным массиве)

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortingSearchingArrays {
    public static void main(String[] args) {

        // Задача
        // 1. Создать массив и заполнить его случайными числами.
        // 2. Отсортировать массив с помощью [Arrays.sort()].
        // 3. Получить число от пользователя.
        // 4. Проверить, присутствует ли это число в массиве, используя метод [Arrays.binarySearch().]

        //
        int sizeNumbers = 10; // Размер массива
        int[] array = new  int[sizeNumbers];
        Random random = new Random();


        // Заполнять массив с случайными числами !!!
        for (int i = 0; i < sizeNumbers; i++) {
            array[i] = random.nextInt(100);
        }


        // сортировка массива
        Arrays.sort(array);
        System.out.println("Сортировка : " + Arrays.toString(array));

        // получить числа от [user]
        System.out.println("Введите число для поиска : ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int userInput = scanner.nextInt();

        // проверка есть ли число в массиве
        int result = Arrays.binarySearch(array, userInput);
        if (result >= 0) {
            System.out.println("Число " + userInput + " найдено в массиве");
        } else {
            System.out.println("Число " + userInput + " не найдено в массиве");
        }




        // Изучение сортировки
        // Arrays.sort - [Встроенный метод]
        int [] numbers1 = {1,2,3,4,55,66,-1,55, 56, 88};
        Arrays.sort(numbers1);
        System.out.println("Сортировка массива : " + Arrays.toString(numbers1));


        // Сортировка части массива
        int [] numbers2 = {22,33,4,5,6,78,-1, 88, 9};
        Arrays.sort(numbers2, 2, 5); // сортирует элементы с индекса 2 до 5
        System.out.println("Сортировка массива : " + Arrays.toString(numbers2));

        int [] numbers3 = {33, 5, -1, 66, 90, 85, -9, 55,66,77,88,99,76};
        Arrays.sort(numbers3, 2, 7); // сортирует элементы с индекса 2 до 5
        System.out.println("Сортировка массива : " + Arrays.toString(numbers2));

        // Сортировка обьектов


        // split(",\\s*") - [разделили строку],
        // [чтобы получить отдельные имена в массиве],
        // [а не держать их одной длинной строкой].
        // ❗[иначе просто так не сортировать если массив String одном длинном строке]
        String studentsSort = "Элмирбек, Кайрат, Акылбек, Кубаныч, Бакыт, Эрасыл";
        String[] student = studentsSort.split(",\\s*");
        Arrays.sort(student);
        System.out.println("Сортировка обьектов массива : " + Arrays.toString(student));





    }

}
