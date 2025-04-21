package basics.azamat.begimai;

import java.util.Scanner;

public class MainUni {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Möchten Sie einen neuen Studenten hinzufügen? (ja/nein): ");
            String antwort = scanner.nextLine().trim().toLowerCase();

            if (antwort.equals("ja")) {
                studentList.addStudent();
            } else if (antwort.equals("nein")) {
                break;  // Schleife beenden
            } else {
                System.out.println("Bitte geben Sie 'ja' oder 'nein' ein.");
            }
        }

        System.out.println("\n--- Alle Studenten ---");
        studentList.showAllStudents();
    }
}