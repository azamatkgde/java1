package collections.aibek;

import java.util.ArrayList;
import java.util.List;

public class ListCollecttion {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Алма");
        fruits.add("Алмурут");
        fruits.add("Банан");

        System.out.println(fruits.get(1));
        System.out.println(fruits);
    }
}
