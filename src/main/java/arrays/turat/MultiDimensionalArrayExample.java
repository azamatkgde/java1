package arrays.turat;

public class MultiDimensionalArrayExample {
    public static void main(String[] args) {
        // 1. Эки өлчөмдүү массивди жарыялоо жана толтуруу
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        // 2. Бир элементке жетүү
        System.out.println("[0][0] индекстеги элемент: " + matrix[0][0]);

        // 3. Матрицаны толугу менен чыгаруу
        System.out.println("Матрица:");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
