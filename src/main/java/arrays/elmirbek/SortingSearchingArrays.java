package arrays.elmirbek;

// как работает массив с методами

// методы для массива

// Arrays.sort(array) ✅ - сортировка массива

// Arrays.toString(array) ✅ - преоброзвание массива в строку [Строковое представление массива, например: [1, 2, 3]] - для удобного отображение

// Arrays.equals(array1, array2) ✅ - сравнение массивов [Сравнение содержимого - boolean (true/false)]

// ArrayCopyOf(array, newLength) ✅ - копирование массива []

// Arrays.fill(array, value) ✅ - заполнение массива значением

// Arrays.binarySearch(array, key) ✅ - бинарный поиск (в отсортированным массиве)

import arrays.asan.Array;

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

//         проверка есть ли число в массиве
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




        // метод equals сравнивает массива и возврощает boolean значение

        int[] arr1 = {1,2,3};
        int [] arr2 = {1,2,3};
        int [] arr3 = {6,7,8};

        System.out.println("int Метод equals : " + Arrays.equals(arr1, arr3));

        // строками тоже так же работает

        String[] hello = {"Hello World"};
        String[] hello1 = {"Hello World"};
        String [] hello2 = {"Hello Java"};

        System.out.println("String Метод equals : " + Arrays.equals(hello, hello1));


        // глубокое сравнение многомерных массивов с методом deepEquals

        int[][] arr4 = {{1,2}, {3,4}};
        int [][] arr5 = {{1,2}, {3,4}};
        int [][] arr6 = {{9,10}, {11,12}};
        // arr4
        // │
        // ├── arr4[0] → [1, 2]
        // │             │  │
        // │             │  └── arr4[0][1] = 2
        // │             └──── arr4[0][0] = 1
        // │
        // ├── arr4[1] → [4, 6]
        // │             │  │
        // │             │  └── arr4[1][1] = 6
        // │             └──── arr4[1][0] = 4
        // │
        // └── arr4[2] → [9, 10]
        //               │   │
        //               │   └── arr4[2][1] = 10
        //               └───── arr4[2][0] = 9


        // сравнение многомерных массивов с методом deepEquals

        System.out.println("int Метод deepEquals с многомерным массивом : " + Arrays.deepEquals(arr4, arr6));

        // Строками тоже так же работает

        String[][] arrayNames = {{"Elmirbek, Bakdoolot, Nursultan"}, {"Elmirbek, Bakdoolot, Nursultan"},};
        String[][] arrayNames1 = {{"Elmirbek, Bakdoolot, Elina"}, {"Elmirbek, Bakdoolot, Nursultan"},};
        String[][] arrayNames2 = {{"Elmirbek, Bakdoolot, Nursultan"}, {"Elmirbek, Bakdoolot, Nursultan"},};

        // Глубокое сравнение с методом deepEquals

        System.out.println("String Метод deepEquals с многомерным массивом : " + Arrays.deepEquals(arrayNames, arrayNames2));


        // ArrayCopyOf(array, newLength) - копирование массива и доавление новых елементов

        int [] original = {1,2,3};

        // копия той же длины [1,2,3]
        int[] copy = Arrays.copyOf(original, 3);

        // добавление еще два элемента
        int [] copy1 = Arrays.copyOf(original, 5);
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(copy1));

        // Копирование массива и добавление обьектов (String) с помощью метода copyOf
        String[] students = {"Элмирбек", "Жаркынай", "Сезим"};
        String [] copyStudents = Arrays.copyOf(students, 3);
        String [] copyStudents1 = Arrays.copyOf(students, 5);
        System.out.println("Скапировать три элемента : " + Arrays.toString(copyStudents));
        System.out.println("Добавление еще 2 элемента : " + Arrays.toString(copyStudents1));

        // Arrays.fill(array, value) - заполнение всего массива с указанным значением


        // примеры с примитивные типы данных (int, char, boolean)
        // Обьектами (String, пользоветелеские классы)

        int[] arr7 = new int [5];
        Arrays.fill(arr7, 7); // заполнение елементов
        System.out.println("Заполнение массива с значением  7 : " + Arrays.toString(arr7));

        // с примитивный типы данных char

        char [] favorite = new  char[5];
        Arrays.fill(favorite, '❤');
        System.out.println("Заполнение массива с значнем ❤ : " + Arrays.toString(favorite));

        // С обьектами тоже так же работает пример

        String[] names = new  String[5];
        Arrays.fill(names, "Elmirbek");
        System.out.println("Заполнение массива с начением Elmirbek " + Arrays.toString(names));



    }

}
