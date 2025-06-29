package collections.aizat;

import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args){
        Map<String, String> countries = new HashMap<>();

        countries.put("Germany", "Berlin");
        countries.put("France", "Paris");

        System.out.println(countries.get("France"));
    }
}
