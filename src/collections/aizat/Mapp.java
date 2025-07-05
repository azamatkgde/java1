package collections.aizat;

import java.util.HashMap;
import java.util.Map;

public class Mapp {
    public static void main(String[] args){
        Map<String, String> countries = new HashMap<>();

        countries.put("Kyrgyzstan", "Bishkek");
        countries.put("Germany", "Berlin");
        countries.put("France", "Paris");
        countries.put("Russia", "Moscow");
        countries.put("Japan", "Tokyo");

        System.out.println(countries.get("Kyrgyzstan"));
        System.out.println(countries.get("Russia"));
        System.out.println(countries.get("Japan"));

    }
}
