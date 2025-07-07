package collections.erlan;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main (String[] args) {
        Map<String, String> dishes = new HashMap<>();
        dishes.put("Кыргыз эли", "Беш бармак");
        dishes.put("Италия", "Пицца");
        dishes.put("Грузия", "Хачапури");
        dishes.put("Грузия", "Хачапури");

        System.out.println(dishes.get("Кыргыз эли"));
        System.out.println(dishes.get("Италия"));
        System.out.println(dishes.get("Грузия"));
        System.out.println(dishes.get("грузия"));
    }
}
