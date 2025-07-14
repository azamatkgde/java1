package collections.zhanna;

import java.util.*;

public class StudentList{
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Aida");
        students.add("Bek");
        students.add("Aidana");
        students.add("Nursultan");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Текшериле турган студенттин ысымын жазыңыз: ");
        String name = scanner.nextLine();

        if (students.contains(name)) {
            System.out.println(name + " тизмеде бар.");
        } else {
            System.out.println(name + " тизмеде жок.");
        }
    }
}
