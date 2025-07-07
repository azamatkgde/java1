package ifelse.aibek;

import java.util.Scanner;

public class SwitchCaseFruit {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in );
    String fruit = "Алмурут";
    switch (fruit ){
        case "Алма":
            System.out.println("Бул алма ") ;
            break;
        case "Жузум":
            System.out.println("Бул жузум ") ;
            break;
        case "Банан":
            System.out.println("Бул банан") ;
            break;
        case "Алмурут":
            System.out.println("Бул алмурут") ;
            break;
        default : System.out.println("Мындан башка жемиш жок ") ;
    }

}


}
