package ifelse.aibek;

import java.util.Scanner;

public class IfElseTemperature {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in );
    System.out.println("Аба ыраайын карап жолго чыгыныз: ") ;
    int temperature = scanner.nextInt();


    if(temperature > 30){
        System.out.println("Аба ыссык. Жеңил кийим кииңиз.") ;
    }else if (temperature >0 && temperature <= 30){
        System.out.println("Кадимки кийим кииңиз") ;
    } else  { System.out.println("Аба суук. Жылуу кийим кииңиз.") ;

    }
 }
}
