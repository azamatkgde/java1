package collections.azamat;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        cities.add("Бишкек");
        cities.add("Дортмунд");
        cities.add("Бишкек");

        System.out.println(cities);
    }
}
