package forwhile.turat;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Кайсы сан үчүн көбөйтүү таблицасын көргүңүз келет? Санды жазыңыз: ");
        int n = scanner.nextInt();

        System.out.println("\n" + n + " санынын көбөйтүү таблицасы:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " × " + i + " = " + (n * i));
        }

        System.out.println("\nАзаматсыз! Көбөйтүү таблицасы ийгиликтүү бүттү.");
    }
}
