package variable.yryskeldi;
import  java.util.Scanner;
public class IfElse {
    public  static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Жашынызды жазыныз: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Ката,туура жазыныз!");
        } else if (age < 7) {
            System.out.println("Жаш бала.");
        } else if (age < 18) {
            System.out.println("Оспурум.");
        } else if (age < 60) {
            System.out.println("Киши.");
        } else {
            System.out.println("Ак сакал.");
        }
    }
}
