package ifelse.azamat.begimai;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie eine Zahl zwischen 1 und 7 ein: ");
        int tag = scanner.nextInt();


        switch (tag) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Kein gültiger Tag");
        }


        System.out.println("Prüfung");
        int a = scanner.nextInt();
        int b = 60;
        System.out.println("hast du Prüfung bestanden?");

        if (b < a) //wenn über 60 besteht man
        {
            System.out.println("ja");
        } else {
            System.out.println("nein");
        }
        scanner.close();
    }
}