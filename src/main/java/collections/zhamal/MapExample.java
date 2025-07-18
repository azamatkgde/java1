package collections.zhamal;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main (String[]args){
        Map<String, String >antonimder= new  HashMap<>();
        antonimder.put(" ak ", " kara ");
        antonimder.put(" uzun ", " kyska ");
        antonimder.put("  kun ", " tun ");
        antonimder.put(" erte ", " kech ");

        System.out.println(antonimder.get(" erte "));
    }
}
