package collections.azamat.yryskeldi;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class UniqueCities {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Уникалдуу шаарларды киргизиңиз (чыгуу үчүн 'exit'):");

        while (true) {
            System.out.print("Шаар: ");
            String city = scanner.nextLine();

            if (city.equalsIgnoreCase("exit")) break;

            if (cities.add(city)) {
                System.out.println("Шаар кошулду.");
            } else {
                System.out.println("Бул шаар мурда эле бар.");
            }
        }

        System.out.println("Бардык уникалдуу шаарлар: " + cities);
    }
}