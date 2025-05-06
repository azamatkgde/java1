package ifelse.kunduz;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElse {
         public static String translateBoolean(boolean value) {
             return value ? "yes" : "no";
         }


    public static void main(String[] args) {
             Scanner s = new Scanner(System.in);
             int age = 50;
         String answer = s.nextLine();
         if (answer != "yes ") {
             System.out.println("вы не можете брать кредит");

         }else{
             System.out.println("тогда вы можете брать кредит");
         }
        System.out.println("Ciao");
         }


}