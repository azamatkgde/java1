package basics.azamat.begimai;

import java.util.Scanner;

public class StudentList {

    private Student[] students = new Student[3];
    private int counter = 0;

    //method
    public void addStudent() {
        if (counter >= students.length) {
            System.out.println("Studentenliste ist voll!");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Geben Sie bitte den Namen ein: ");
        student.setName(scanner.nextLine());

        System.out.print("Geben Sie bitte das Alter ein: ");
        student.setAge(scanner.nextInt());
        scanner.nextLine(); // Zeilenumbruch einfangen!

        System.out.print("Geben Sie bitte die Gruppe ein: ");
        student.setGroup(scanner.nextLine());

        System.out.print("Geben Sie bitte den Beruf ein: ");
        student.setProfession(scanner.nextLine());

        students[counter++] = student;
        System.out.println("Student wurde erfolgreich gespeichert!\n");
    }

    public void showAllStudents() {
        if (counter == 0) {
            System.out.println("Keine Studenten gespeichert.");
            return;
        }

        for (int i = 0; i < counter; i++) {
            System.out.println("--- Student " + (i + 1) + " ---");
            System.out.println("Name: " + students[i].getName());
            System.out.println("Alter: " + students[i].getAge());
            System.out.println("Gruppe: " + students[i].getGroup());
            System.out.println("Beruf: " + students[i].getProfession());
            System.out.println();
        }
    }
}