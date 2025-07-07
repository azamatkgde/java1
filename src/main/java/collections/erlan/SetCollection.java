package collections.erlan;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main (String[] args){
        Set<String> langueges = new HashSet<>();
        langueges.add("Кыргыз тили");
        langueges.add("Немис тили");
        langueges.add("Кыргыз тили");

        System.out.println(langueges);
    }
}
