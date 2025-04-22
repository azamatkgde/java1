package variable.zhanyl;

import java.util.Scanner;
import java.util.Scanner ;
    public class Variable{
        public static void main(String[] args) {
            System.out.println("Salam!");
            String vorname="Zhanyl";
            String Nachname=" Munduzova";
            System .out .println("Ich bin "+ vorname +  Nachname );
            int age=23;
            System.out .println("Мен " +age  +  " жаштамын,");
            int Schuller=24;
            int Männer=10;
            int Frauen=14;
            int insgesamt=Männer+Frauen;
            System .out .println("Wir sind "+insgesamt  +" teilnehmer");
            int a=30;
            int b=2;
            int c=30/2;
            System .out .println("Wir müssen diese Aufgabe berechnen") ;
            System .out .println("Und die lössung ist " +c ) ;
            System .out .println("Wie viel Zahlen passt für short? "+ Short .MAX_VALUE ) ;
            short shortnummer=3000;
            System .out .println("Ich möchte gerne "+shortnummer  +" €"+" Netto in Monat verdienen");
            double euro=10.4;
            System .out .println("Das Buch "+"kostet " + euro +" €" );
            boolean istInteresan=true ;
            boolean istLangweilig=false ;
            System .out .println("Findest du das Kino interesant?"+(istInteresan ||istLangweilig ) ) ;
            System .out .println("Findest du das Kino interesant?"+(istInteresan && istLangweilig));;
            Scanner scanner =new Scanner(System.in );
            System .out .println("Бул калем канча турат ?");
            System .out .println("Баасын жаз");
            int preis= scanner.nextInt();;
            System .out .println("Kалем "+preis +"турат");;
            scanner.close() ;;




        }
    }

