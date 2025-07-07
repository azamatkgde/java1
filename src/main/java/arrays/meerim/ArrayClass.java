package arrays.meerim;

import arrays.meerim.Utility;

import java.util.Arrays;

public class ArrayClass {

    public static void main(String[] args) {
        int n = Utility.chiediInt("Dai N:");
        int[] arr = fillArray(n);

        boolean exit = false;
        while (!exit) {
            // Башкы меню
            System.out.println("Choose an operation:");
            System.out.println("1. Calculate Sum");
            System.out.println("2. Calculate Average");
            System.out.println("3. Find Max");
            System.out.println("4. Find Min");
            System.out.println("5. Sort Array");
            System.out.println("6. Search for a Number");
            System.out.println("7. Exit");

            int choice = Utility.chiediInt("Enter the number corresponding to the operation:");

            // `switch` операторун колдонбой, шарттар менен текшерүү
            switch (choice) {
                case 1:
                    printSum(arr);
                    break;
                case 2:
                    printAverage(arr);
                    break;
                case 3:
                    printMax(arr);
                    break;
                case 4:
                    printMin(arr);
                    break;
                case 5:
                    printSorted(arr);
                    break;
                case 6:
                    searchInArray(arr);
                    break;
                case 7:
                    exit = true; // Программадан чыгуу
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }

    // Массивди толтуруу
    public static int[] fillArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Utility.chiediInt("Element " + (i + 1) + ":");
        }
        return arr;
    }

    // Сумманы эсептөө
    public static void printSum(int[] arr) {
        int sum = calculateSum(arr);
        System.out.println("Sum: " + sum);
    }

    // Орточо маанини эсептөө
    public static void printAverage(int[] arr) {
        double avg = calculateAverage(arr);
        System.out.println("Average: " + avg);
    }

    // Эң чоң элементти табуу
    public static void printMax(int[] arr) {
        int max = findMax(arr);
        System.out.println("Max: " + max);
    }

    // Эң кичине элементти табуу
    public static void printMin(int[] arr) {
        int min = findMin(arr);
        System.out.println("Min: " + min);
    }

    // Массивди сорттоо
    public static void printSorted(int[] arr) {
        int[] sorted = sortArray(arr);
        System.out.println("Sorted: " + Arrays.toString(sorted));
    }

    // Массивден санды издөө
    public static void searchInArray(int[] arr) {
        int target = Utility.chiediInt("Enter the number to search in the array:");
        int index = findIndex(arr, target);
        if (index != -1) {
            System.out.println("Number " + target + " found at index: " + index);
        } else {
            System.out.println("Number " + target + " not found in the array.");
        }
    }

    // Сумманы эсептөө
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Орточо маанини эсептөө
    public static double calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }

    // Эң чоң элементти табуу
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Эң кичине элементти табуу
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Массивди сорттоо
    public static int[] sortArray(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        return copy;
    }

    // Массивден санды издөө
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Индекс кайтарылат
            }
        }
        return -1; // Эгер табылбаса, -1 кайтарылады
    }
}