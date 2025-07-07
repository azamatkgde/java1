package arrays.aizat;

//Матрицанын суммасын табуу:
public class ArrayHW22 {
    public static void main(String[] args) {
        int[][] massiv = {{5, 2}, {7, 10}};
        int sum = 0;

        for (int i = 0; i < massiv.length; i++) {
            for (int j = 0; j < massiv[i].length; j++) {
                sum = sum + massiv[i][j];
            }
        }

        System.out.println("Массивдин суммасы: " + sum);
    }
}
