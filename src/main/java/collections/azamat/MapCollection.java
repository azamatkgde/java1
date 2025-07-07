package collections.azamat;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("Germany", "Berlin");
        countries.put("Kyrgyzstan", "Bischkek");

        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 2);
        Map<Boolean, Boolean> yesNo = new HashMap<>();
        yesNo.put(true, false);

        System.out.println(countries.get("Germany"));
        System.out.println(countries.get("Kyrgyzstan"));
        System.out.println(numbers.get(1));
    }
}
