package variable.sezim;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //Баалоо системасы:
        Scanner s = new Scanner(System.in);
   System.out.println("Your raiting  between 0 and 100:");
  int raiting  = s.nextInt();
  if(raiting > 90 &&  raiting<= 100){
     System.out.println("5");
  } else if (raiting > 70 && raiting <= 89) {
       System.out.println( "4" );
   }else if(raiting > 50 && raiting <= 69) {
       System.out.println("3");
    } else if (raiting == 0 && raiting <= 49) {
      System.out.println("2");
      Scanner close;
  }
    }
}
