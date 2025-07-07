package arrays.aizat;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayHW23 {
    public static void main(String[] args) {
        int[] sandar = {55, 20, 18, 5, 77, 8, 10, 1,11, 24 };

        Arrays.sort(sandar);
        System.out.println("Сорттолгон массив: " + Arrays.toString(sandar));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Издей турган санды киргизиңиз: ");
        int koldonuuchununsany = scanner.nextInt();

        int posi= Arrays.binarySearch(sandar, koldonuuchununsany);
        if (posi >= 0) {
            System.out.println("Сиз берген сан " + koldonuuchununsany + " " + "бул сан массивде бар, индекси: " + posi);
        } else {
            System.out.println("Сиз берген сан " + koldonuuchununsany + " " + "бул сан массивде жок.");
        }

        scanner.close();

    }
}
