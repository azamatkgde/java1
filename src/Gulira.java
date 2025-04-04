import java.util.Scanner;

    public class Gulira {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            String input = "";

            while (!"exit".equals(input)) {
                System.out.print("Сөз жаз (чыгыш үчүн 'exit'): ");
                input = scanner.nextLine();
                System.out.println("Cиз " + input + " деп жаздыңыз");
            }

            System.out.println("Программа аяктады");

            for (int i = 10; i >=1; i--) {
                System.out.println(i);
            }

            for (int i = 1; i >= 10; i++) {
                System.out.println(i +" *10= " + (i*10));
            }

            scanner.close();
        }
    }




