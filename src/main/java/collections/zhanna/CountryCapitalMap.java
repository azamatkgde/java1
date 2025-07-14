package collections.zhanna;

import java.util.*;

public class CountryCapitalMap {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Кыргызстан", "Бишкек");
        capitals.put("Швеция", "Стокгольм");
        capitals.put("Германия", "Берлин");
        capitals.put("Франция", "Париж");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Өлкөнүн атын жазыңыз: ");
        String country = scanner.nextLine();

        if (capitals.containsKey(country)) {
            System.out.println("Борбору: " + capitals.get(country));
        } else {
            System.out.println("Бул өлкө базага кошула элек.");
        }
    }
}
