package collections.aibek;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,String> countryCapitals = new HashMap<>();

        countryCapitals.put("Кыргызстан", "Бишкек");
        countryCapitals.put("Германия", "Берлин");
        countryCapitals.put("Франция", "Париж");

        System.out.println("\nӨлкөнү киргизиңиз (мисалы: Германия): ");
        String country = scanner.nextLine();

        if (countryCapitals.containsKey(country)) {
            System.out.println("Борбору: " + countryCapitals.get(country));
        } else {
            System.out.println("Бул өлкө маалымат базада жок.");
        }

        scanner.close();
    }
}
