package collections.aibek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListStudents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> studentNames =  new ArrayList<>();
        studentNames.add("Yryskeldi");
        studentNames.add("Bekbolot");
        studentNames.add("Erlan");
        studentNames.add("Zhanna");
        studentNames.add("Aibek");
        studentNames.add("Aizat");

        System.out.println("Текшерилчү студенттин ысымын киргизиңиз: ");
        String nameToCheck  = scanner.nextLine();
        if (studentNames.contains(nameToCheck)) {
            System.out.println(nameToCheck + " тизмеде бар.");
        } else {
            System.out.println(nameToCheck + " тизмеде жок.");
        }
    }
}
