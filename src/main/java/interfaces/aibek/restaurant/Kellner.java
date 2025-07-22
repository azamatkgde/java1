package interfaces.aibek.restaurant;

import java.util.Random;
import java.util.Scanner;

public class Kellner implements Service{
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    @Override
    public void arbeiten() {
        String restaurant = "Hotel zur Post";
        int stunde = 8;
        System.out.println(" Sofia arbeitet " + stunde + " Stunden am Tag im " + restaurant);


    }

    @Override
    public void bedienen() {
        int anzahlGaeste = 100;
        System.out.println("Sofia bedient täglich etwa " + anzahlGaeste + " Gäste.");


    }

    @Override
    public void kassieren() {
        int trinkGeld = 50 + random.nextInt(11);
        System.out.println("Sofia kassiert die Rechnungen und der Gäste und bekommt etwa " + trinkGeld +" € Trinkgeld.");

    }
    public void aktionWaehlen (){
        System.out.println("Waehlen Sie eine Aktion: ");
        System.out.println("1 - Arbeiten ");
        System.out.println("2- Bedienen");
        System.out.println("3- Kassieren");

        int auswahl = scanner.nextInt();
        switch (auswahl){
            case 1 :
                arbeiten();
                break;
            case 2:
                bedienen();
                break;
            case 3:
                kassieren();
                break;
            default:
                System.out.println("Ungültige Auswahl! ");
        }
    }

}
