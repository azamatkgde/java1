package collections;

import abstractclass.aizat.SouthKorea;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitList {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
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
