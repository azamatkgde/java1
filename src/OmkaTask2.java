import java.util.Scanner;

public class OmkaTask2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Сизге кайсы сандын көбөйтүү таблицасы керек?: ");
        int table = scanner.nextInt();
        for (int j = 1; j <= 10; j++) {
            System.out.println(table + " * " + j + " = " + (table * j));
            scanner.close();
        }
    }
}
