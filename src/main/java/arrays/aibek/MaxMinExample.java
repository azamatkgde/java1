package arrays.aibek;


import java.util.Random;
import java.util.Arrays;

public class MaxMinExample {
    public static void main(String[] args) {
        int[] array = new int[10];      // 10 элементтен турган массив түзүлөт
        Random rand = new Random();    //Random классын колдонобуз,Random сандарды түзөт

        //Массивди random сандар менен толтуруу
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(100)+1;    // 1ден 100гө чейинки сан берет
        }

        //Массивди басып чыгаруу
        System.out.println("Массив: ");
        System.out.println(Arrays.toString(array));     //Массивди текстке айлантып, консольго чыгарат
        //Методдорду чакыруу
        int max = findMax(array);
        int min = findMin(array);

        //Натыйжаларды чыгаруу
        System.out.println("Эн чон мааниси: " + max);
        System.out.println("Эн чон мааниси: " + min);

    }

    //Эң чоң маанини тапкан метод
    public static int findMax(int[] arr){
        int max = arr[0];                                //Биринчи элементти баштапкы max кылып алабыз
        for(int i = 1; i <arr.length; i ++ ) {
            if(arr[i] > max){                            //Эгер жаңы элемент чоң болсо
                max = arr[i];                            //max'ка жаңы маанини сактайбыз
            }
        }
        return max;                                      // max маанини кайтарабыз
    }


    //Эң кичине маанини тапкан метод
    public static int findMin(int[] arr){
        int min = arr[0];                            // Биринчи элементти баштапкы min кылып алабыз
        for(int i = 1; i < arr.length;i ++){
            if(arr[i]<min){                         //Эгер жаңы элемент кичине болсо
                min = arr[i];                       //min'ге жаңы маанини сактайбыз

            }
        }
        return min;                               // min маанини кайтарабыз
    }
}
