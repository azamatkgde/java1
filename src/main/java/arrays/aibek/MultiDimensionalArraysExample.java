package arrays.aibek;


public class MultiDimensionalArraysExample {
    public static void main(String[] args) {
        int [][] matrix = {       //3x3 өлчөмүндөгү (3 катар, 3 тилке) матрица түзүлдү.
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        System.out.println("[0][0]индекстеги элемент: "+ matrix[0][0] ) ;   //matrix[0][0] деген — матрицанын биринчи катаардагы, биринчи тилкесиндеги элемент.Бул учурда: 1

        System.out.println("Матрица: ") ;
        for(int i= 0; i < matrix.length; i ++){                //Тышкы цикл (i) — катарлар боюнча.
            for (int j= 0; j < matrix[i].length ; j ++) {      //Ички цикл (j) — тилкелер боюнча.
                System.out.print( matrix[i][j] + " " );

            }System.out.println() ;

        }
    }
}

