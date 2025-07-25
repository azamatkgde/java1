package collections.aibek;

import java.util.HashMap;
import java.util.Map;

public class MapCollecton {
    public static void main(String[] args) {
        Map<String, String> countries  = new HashMap<>();
        countries.put("Germany", "Berlin");
        countries.put("Kyrgyzstan", "Bishkek");
        System.out.println(countries.get("Germany"));
        System.out.println(countries.get("Kyrgyzstan"));

    }
}
