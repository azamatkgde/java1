import java.util.Scanner;

public class OmkaTask3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.print("Сан бер бул жака:  ");
            num = scanner.nextInt();
            System.out.println("Cиз берген сан: " + num);
        }
        while (num != 0);
            System.out.println("Сан 0 го барабар");
            scanner.close();
    }
}