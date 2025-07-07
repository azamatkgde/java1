package arrays.aibek;


import java.util.Scanner;

public class MatrixImput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );

        System.out.println("Катарлардын санын киргизиниз: ");
        int rows = scanner.nextInt();   //	Матрицадагы катарлардын саны
        System.out.println("Тилкелердин санын киргизиниз: ");
        int cols = scanner.nextInt();   // 	Матрицадагы тилкелердин саны

        int [][] matrix = new int[rows][cols];

        // Колдонуучудан ар бир элементти суроо
        System.out.println("Матрицанын элементтерин киргизиниз: ");
        for(int i = 0; i < rows ; i ++){
            for (int j = 0; j < cols; j++  ) {
                System.out.print("["+i+"]["+j+"]= ");
                matrix[i][j]= scanner.nextInt();
            }

        }
        //Матрицаны экранга чыгаруу
        System.out.println("Матрица: ");
        for(int i = 0; i < rows ;i ++){
            for(int j = 0; j < cols ; j ++){
                System.out.print(matrix[i][j] +" ");


            } System.out.println() ;  // ар бир катардан кийин жаны сап

        } scanner.close();
    }
}
