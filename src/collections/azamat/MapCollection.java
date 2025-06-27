package collections.azamat;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("Germany", "Berlin");
        countries.put("Kyrgyzstan", "Bischkek");

        System.out.println(countries.get("Germany"));
        System.out.println(countries.get("Kyrgyzstan"));
    }
}
