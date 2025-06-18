package interfaces.zhamal;

import java.util.Scanner;

public class Neurolog implements Arzt{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void arbeiten() {
        int Stunde = 45;
        String Klinik = " Sharite";
        System.out.println( " Dr. M arbeitet " + Stunde + " Stunde in der Woche im " + Klinik);
    }

    @Override
    public void behandeln() {

        System.out.print( " Bitte geben sie ein Zahl bis 4");
        int Tag = scanner.nextInt();

        switch (Tag){

            case 1:
                System.out.println(" Montag - von 8 bis 16 Uhr ");
                break;
            case 2:
                 System.out.println(" Dienstag - Frei ");
                 break;

            case 3:
                System.out.println(" Mittwoch - von 16 bis 23 Uhr");
                break;
            case 4:
                System.out.println(" Samstag - von 8 bis 20 Uhr ");
                break;
            default:
                System.out.println(" Sie haben keine richtige Zahl eingegeben ");
                break;
        }



    }

    @Override
    public void untersuchen() {

        System.out.println(" Untersuchung nur mit Überweisungsschein möglich");

    }
}
