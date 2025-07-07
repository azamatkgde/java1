package collections.aizat;

import java.util.HashSet;
import java.util.Set;

public class Sett {
    public static void main(String[] args) {
        Set<String>  regions = new HashSet<>();

        regions.add("Chuy");
        regions.add("Batken");
        regions.add("Talas");
        regions.add("Osh");
        regions.add("Jalal-Abad ");
        regions.add("Talas");
        regions.add("Naryn");
        regions.add("Osh");
        regions.add("Issyk-Kul");
        regions.add("Chuy");
        regions.add("Naryn");
        regions.add("Jalal-Abad ");
        regions.add("Issyk-Kul");

        System.out.println("There are seven regions in Kyrgyzstan. They are: ");
        System.out.println(regions);
    }
}
