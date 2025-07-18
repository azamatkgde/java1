package collections.zhamal;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main (String[]args){
        Set<String> medikamente = new HashSet<>();
        medikamente.add(" Paracetamol 10 mg");
        medikamente.add("Ibuprofen 400 mg");
        medikamente.add(" Cetirizin 10 mg");
        medikamente.add(" Paracetamol 10 mg");

        System.out.println(medikamente);
    }
}
