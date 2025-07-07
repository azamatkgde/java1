package collections.aizat.collec;

import java.util.HashSet;
import java.util.Set;

public class SetExam {
    public static void main(String[] args){
       Set<String> cities = new HashSet<>();
        cities.add("Osh");
        cities.add("Bishkek");
        cities.add("Osh");
        System.out.println(cities);
    }
}
