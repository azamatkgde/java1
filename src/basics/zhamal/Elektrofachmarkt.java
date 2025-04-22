package basics.zhamal;

import java.util.Scanner;

public class Elektrofachmarkt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TVundAudio[] auswahl = new TVundAudio[3];
        auswahl[0] = new TVundAudio("Music Box", 12, true, 889, true);
        auswahl[1] = new TVundAudio("Samsung ", 45, false, 776, false);
        auswahl[2] = new TVundAudio("Huawei", 80,true, 1200,  true);

        int auswahlMenu = -1;

        do {
            System.out.println(" ELEKTROFACHMARKT MENÜ:");
            System.out.println(" 1 - Alle Produkte anzeigen ");
            System.out.println(" 2 - Produkt kaufen ");
            System.out.println(" 3 - Ratenzahlung prüfen ");
            System.out.println(" 0 - Beenden ");
            System.out.print("Bitte wählen Sie: ");
            auswahlMenu = scanner.nextInt();

            switch (auswahlMenu) {
                case 1:
                    System.out.println(" Verfügbare Produkte:");
                    for (int i = 0; i < auswahl.length; i++) {
                        System.out.println(" Produkt #" + i);
                        auswahl[i].info();
                    }
                    break;

                case 2:
                    int eingabe = -1;
                    while (true) {
                        System.out.print("Welches Produkt möchten Sie kaufen? (Nummer 0 bis 2): ");
                        eingabe = scanner.nextInt();
                        if (eingabe >= 0 && eingabe < auswahl.length) {
                            TVundAudio produkt = auswahl[eingabe];
                            if (produkt.getVerfügbarkeit()) {
                                System.out.println("✅ Das Produkt ist verfügbar:");
                                produkt.info();
                                break;
                            } else {
                                System.out.println("❌ Dieses Produkt ist nicht verfügbar.");
                                break;
                            }
                        } else {
                            System.out.println("⚠️ Ungültige Nummer. Bitte 0, 1 oder 2 eingeben.");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Wie alt sind Sie? ");
                    int alter = scanner.nextInt();
                    if (alter >= 18) {
                        System.out.println("✅ Sie haben Möglichkeit für Ratenzahlung.");
                    } else {
                        System.out.println("❌ Leider keine Ratenzahlung möglich.");
                    }
                    break;

                case 0:
                    System.out.println("👋 Programm beendet. Danke!");
                    break;

                default:
                    System.out.println("❗ Ungültige Auswahl. Bitte nochmal versuchen.");
            }
        } while (auswahlMenu != 0);

        scanner.close();
    }
}










