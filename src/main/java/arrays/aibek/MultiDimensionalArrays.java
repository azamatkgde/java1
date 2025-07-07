package arrays.aibek;


public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int [][] matrix = {                                // бул эки өлчөмдүү массив (матрица).
                // 2x3 өлчөмүндөгү матрица (2 катар, 3 тилке)
                {1,2,3},
                {4,5,6}
        };
        for ( int i = 0;  i < matrix.length; i ++){          // катарлардын саны (бул жерде 2).
            for (int j = 0; j < matrix[i].length ;  j ++){     //aр бир катардагы тилкелердин саны (бул жерде 3).
                System.out.print(matrix[i][j] +" ") ;            //i-катар, j-тилкедеги элемент.
            }
            System.out.println() ;                               // ар бир катардан кийин жаңы сапка өтүү
        }
    }
}

