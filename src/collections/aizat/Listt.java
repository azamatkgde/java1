package collections.aizat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listt {
        public static void main(String[] args) {
            List<String> students = new ArrayList<>();

            students.add("Айдана");
            students.add("Нурсултан");
            students.add("Эрмек");
            students.add("Алия");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите имя студента для проверки: ");
            String studentName = scanner.nextLine();

            boolean name = false;

            for (String student : students) {
                if (student.equals(studentName)) {
                    name = true;
                    break;
                }
            }

           if (name) {
                System.out.println(studentName + " есть в списке студентов");
            } else {
                System.out.println(studentName + " не найден в списке");
            }


            scanner.close();
        }
    }

