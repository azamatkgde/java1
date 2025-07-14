package collections;

import java.util.ArrayList;

public class FruitList {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Алмурут");
        fruits.add("Алма");
        fruits.add("Банан");
        fruits.add("Орук");

        System.out.println("Фруктулардые тизмеси:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
