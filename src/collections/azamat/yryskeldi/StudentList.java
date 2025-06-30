package collections.azamat.yryskeldi;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Айдана");
        students.add("Нурбек");
        students.add("Эрмек");
        students.add("Салтанат");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Студенттин ысымын киргизиңиз: ");
        String name = scanner.nextLine();

        if (students.contains(name)) {
            System.out.println(name + " тизмеде бар.");
        } else {
            System.out.println(name + " тизмеде жок.");
        }
    }
}