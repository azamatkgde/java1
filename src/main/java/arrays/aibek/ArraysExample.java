package arrays.aibek;


import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        //Массивди жарыялоо
        int [] numbers;
        numbers = new int[10] ;
        //Же кыскача түрдө:


        //Кыска формада жарыялоо жана инициализациялоо:
        numbers =new int[]  {10,20,30,40,50,60,70,80,90,};

        try {
            System.out.println(numbers[11]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ката: Индекс массивден тышкары болуп жатат!");
        }

        //Элементке жетүү:0 жана 1
        System.out.println("Биринчи элемент: " + numbers [0]) ;
        System.out.println("Экинчи элемент: " + numbers [1]) ;
        //Массивдин узундугун алуу
        System.out.println("Массивдин узундугу: "+ numbers.length ) ;
        // Массивди толугу менен чыгаруу
        System.out.println("Numbers массиви: " + Arrays.toString(numbers )) ;
        //Цикл менен массивдин элементтерин чыгарып берүү
        for(int i =0 ; i < numbers.length ; i ++ ){
            System.out.println("Элемент № " + i + "= " + numbers [i]) ;
        }



    }
}
