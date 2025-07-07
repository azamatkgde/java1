package arrays.asel;

public class TwoDimenArray {
    public static void main(String[] args) {

        int [] [] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(matrix[0][0]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[0][1]);

        System.out.println("Matrix: ");

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j< matrix[i].length; j++) {
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
