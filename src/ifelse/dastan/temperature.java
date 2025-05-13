package ifelse.dastan;

import java.util.Scanner;

public class temperature {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in );
    System.out.println("Аба ырайын жазыныз: ") ;
    int temperatura = scanner.nextInt();


    if(temperatura > 30){
        System.out.println("Аба ыссык!!! Жеңил кийим кийиңиз.") ;
    }else if (temperatura >=0){
        System.out.println("Кадимки кийим кийиңиз") ;
    } else  { System.out.println("Аба суук!!! Жылуу кийим кийиңиз.") ;

    }

}
}




