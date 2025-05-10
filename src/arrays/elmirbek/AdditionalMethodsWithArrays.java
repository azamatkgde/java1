package arrays.elmirbek;

// как работает массив с методами

// методы для массива

// Arrays.sort(array) - сортировка массива

// Arrays.toString(array) - преоброзвание массива в строку [Строковое представление массива, например: [1, 2, 3]] - для удобного отображение

// Arrays.equals(array1, array2) - сравнение массивов [Сравнение содержимого - boolean (true/false)]

// ArrayCopyOf(array, newLength) - копирование массива []

// Arrays.fill(array, value) - заполнение массива значением

// Arrays.binarySearch(array, key) - бинарный поиск (в отсортированным массиве)

public class AdditionalMethodsWithArrays {
    public static void main(String[] args) {

        // найти максимальное число в этом массиве
        int[] numbers = {1,2, 44,66, 666,777,888,90,21,};
        int max = findMax(numbers);
        System.out.println("Максимальное число : " + max);
        // найти минимальное число в этом массиве
        int[] numbers1 = {22, 4, 66, -1, -5, 90, -6, 92, 75, 4, 55};
        int min = findMin(numbers1);
        System.out.println("Минимальное число : " + min);


    }




    // метод найти max число внутри массива
    public static int findMax(int[] array) {
        // если массив пустой выбрасываем ошибку
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Аргумент не должно быть пустым");
        }

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return  max;

    }



    // найти min число внутри масссива
    public  static  int findMin (int[] array) {
        // если массив пустой выбрасываем ошибку
        if (array == null || array.length == 0) {
            throw  new IllegalArgumentException("Аргуемнт не должно быть пустым");
        }

        int min = array[0];
         for (int i = 0; i < array.length; i++) {
             if (array[i] < min) {
                 min = array[i];
             }
         }
         return  min;
    }

}

