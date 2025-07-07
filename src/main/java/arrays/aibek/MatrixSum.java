package arrays.aibek;


public class MatrixSum {
    public static void main(String[] args) {
        int [][] massiv= {
                {10,30,40},
                {50,60,70},
        };
        int sum = 0;     //бул өзгөрмөнү (переменная) жарыялап жана баштапкы маани 0 кылып коюу дегенди билдирет.
        for (int i =0; i < massiv.length ; i ++){
            for(int j = 0; j < massiv[i].length ;j ++){
                sum  += massiv[i][j];
            }
        }
        System.out.println("Матрицанын суммасы: " + sum ) ;
    }
}

