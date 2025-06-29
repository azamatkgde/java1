package collections.aizat;

import java.util.ArrayList;

public class List {
    public static void main (String[] args) {
        java.util.List<String> fruits = new ArrayList<>();
        fruits.add("Алма");
        fruits.add("Алмурут");
        fruits.add("Алма");

        System.out.println(fruits.get(1));
        System.out.println(fruits);

    }
}
