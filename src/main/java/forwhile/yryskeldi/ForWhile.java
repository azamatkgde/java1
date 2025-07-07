package forwhile.yryskeldi;
import  java.util.Scanner;
public class ForWhile {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Тескери: " + i);
        }

        //Таблица
        Scanner scanner = new Scanner(System.in);

        System.out.print("Көптүк таблицасы үчүн бир сан киргизиңиз: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " × " + i + " = " + (n * i));
        }


        //While

        int number;


        do {
            System.out.print("Санды киргизиңиз (0 киргизсеңиз, программа токтойт): ");
            number = scanner.nextInt();
            System.out.println("Сиз киргизген сан: " + number);
        } while (number != 0);

        System.out.println("Программа аяктады.");


        scanner.close();
        //While ички
        int i = 1; // Сырткы цикл үчүн башталыш мааниси

        // Сырткы цикл (i = 1ден 3кө чейин)
        while (i <= 3) {
            System.out.println("i = " + i);

            int j = 1; // Ички цикл үчүн башталыш мааниси

            // Ички цикл (j = 1ден 5ке чейин)
            while (j <= 5) {
                System.out.println("  j = " + j); // Ички циклдин жыйынтыгы
                j++; // Ички циклдин айлануусу
            }

            i++; // Сырткы циклдин айлануусу
        }


    }
}
