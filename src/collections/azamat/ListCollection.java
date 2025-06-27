package collections.azamat;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Алма");
        fruits.add("Алмурут");
        fruits.add("Алма");

        System.out.println(fruits.get(0));
        System.out.println(fruits);
    }
}
