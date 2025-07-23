package collections.aibek;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> sities = new HashSet<>();
        sities.add("Bishkek");
        sities.add("Münich");
        sities.add("Bishkek");
        System.out.println(sities);
    }
}
