package arrays.asan;

import java.util.Scanner;

public class ThreeArray1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Массивдин катарлары");
        int nummers1 = scanner.nextInt();
        System.out.println(" Катардагы элементтер");
        int nummers2 = scanner.nextInt();


        int[][] nummers = new int[nummers1][nummers2];


        System.out.println("Элементтерди киргиз:");
        for (int i = 0; i < nummers.length; i++) {
            for (int j = 0; j < nummers[i].length; j++) {
                nummers[i][j] = scanner.nextInt();
                System.out.print(nummers[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }

}

