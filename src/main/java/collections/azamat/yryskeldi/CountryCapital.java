package collections.azamat.yryskeldi;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String, String> countryCapital = new HashMap<>();


        countryCapital.put("Кыргызстан", "Бишкек");
        countryCapital.put("Казакстан", "Астана");
        countryCapital.put("Германия", "Берлин");
        countryCapital.put("Франция", "Париж");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Өлкөнүн атын киргизиңиз: ");
        String country = scanner.nextLine();

        if (countryCapital.containsKey(country)) {
            System.out.println("Борбору: " + countryCapital.get(country));
        } else {
            System.out.println("Бул өлкө тууралуу маалымат табылган жок.");
        }
    }
}