package arrays.aibek;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortAndSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];       //10 элементтүү бош массив түзөт.
        Random rand = new Random();      //Random сан түзүүчү объект.
        // Массивди random сандар менен толтуруу (1–100)
        for(int i = 0; i < array.length;i ++){
            array[i] = rand.nextInt(100)+1;    //Ар бир элементке 1–100 арасында сан берет.
        }

        //Баштапкы массивди көрсөтүү
        System.out.println("Баштапкы массив: ");
        System.out.println(Arrays.toString(array));    //Массивди басып чыгаруу үчүн.

        //Сорттоо
        Arrays.sort(array);                          //Массивди өскөн тартипте сорттойт.
        System.out.println("Сорттолгон массив: ");
        System.out.println(Arrays.toString(array));  //Массивди басып чыгаруу үчүн.

        //Колдонуучудан сан алуу
        System.out.println("Изделуучу санды киргизиниз: ");
        int key = scanner.nextInt();            //	Колдонуучудан сан алуу.

        // Издоо Search                                    //Бул ыкма өте тез иштейт, бирок сорттолгон массивде гана иштейт.
        //
        //Ошондуктан биз биринчи Arrays.sort() менен массивди сорттойбуз.
        int index = Arrays.binarySearch(array,key);        //Изделип жаткан сан барбы же жокпу — аны табат.
        if (index >= 0){                                  //Эгер сан табылса, анын индексин көрсөтөт.
            System.out.println("Сан табылды! Индекси: " + index );
        }else {
            System.out.println("Сан массивде жок: ");
        }
        scanner.close();


    }
}

