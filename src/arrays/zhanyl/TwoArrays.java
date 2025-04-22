package arrays.zhanyl;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class TwoArrays {
    public static void main (String[] args){
        //Сандык массивди толтуруу:
        int[]numbers;
        numbers=new int[]{5,6,7,8,9,10};
        System.out .println("Биринчи элемент:"+numbers[0]);
        System .out .println("Экинчи элемент:"+numbers [1]);
        System .out .println("Миссивдин узундугу:"+numbers.length );
        System .out .println("Numbers массиви"+ Arrays.toString(numbers ));
        for (int i=5; i< numbers.length; i++){
            System .out .println(numbers[0]+"+" +numbers.length +"="+(numbers[0]+ numbers .length ));
        }
        //Мин/Макс табуу:
        int[] numbers1={10,2,-3,6,9,-1};
        if (numbers.length == 0) {
            System.out.println("Массив бош!");
            return;
        }
        int min=numbers1[0];
        int max=numbers1[0];
        for(int i=1;i< numbers1.length; i++){
            if (numbers1[i]< min) {
                min=numbers1[i];
            }
            if(numbers1 [i]  > max){
                max=numbers1[i];
            }
        }
        System .out .println("Минималдуу маани:" +min) ;
        System .out .println("Максималдуу маани:"+max);

        //Матрицанын суммасын табуу

        int[][] matrix = {
                {1, 4, 6, 7},  // биринчи кат
                {9, 2, 3, 8}   // экинчи кат
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System .out .println("Матрицанын суммасы:" +sum);
        //Матрицаны толтуруу:

        Scanner scanner =new Scanner(System.in);
        System .out .println("Матрицанын катар санын киргизиниз:");
        int rows =scanner.nextInt();
        System .out .println("Матрицанын тилке санын киргизиниз;");
        int clos= scanner.nextInt();
        int[][] matrix1 =new int[rows ][clos ];
        for(int i=0; i<rows; i++ ){
            for (int j=0; j<clos; j++){
                System .out .println("matrix[" +i+"]["+j+"]");
               matrix1[i][j] =scanner.nextInt();
            }
        }
        System.out .println("Матрица:");
        for(int i=0; i<rows; i++){
            for(int j=0; j<clos; j++){
                System .out.println(matrix1[i][j]+" ");
            }
        }
        scanner .close() ;
        //Сорттоо жана издөө:
        int[]Zahl=new int[10];
        Random random=new Random();
        for(int i=0; i< Zahl.length ; i++){
            Zahl[i]= random.nextInt(100)+1;
        }
        System.out.println("Массивдин элементтери (толтурулган):");
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(Zahl);
        System.out.println("Массивдин элементтери (сорттолгон):");
        System.out.println(Arrays.toString(numbers));
        Scanner scanner2=new Scanner(System .in );
        System .out .println("Сан жаз:");
        int searchValue = scanner.nextInt();
        int result = Arrays.binarySearch(numbers, searchValue);
        if (result >= 0) {
            System.out.println("Сан табылды. Индекси: " + result);
        } else {
            System.out.println("Сан табылган жок.");
        }
        scanner2.close();
      }
    }