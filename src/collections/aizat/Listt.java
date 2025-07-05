package collections.aizat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listt {
        public static void main(String[] args) {
            List<String> students = new ArrayList<>();

            students.add("Айзат");
            students.add("Омка");
            students.add("Эрлан");
            students.add("Ажибай");
            students.add("Байма");
            students.add("Бексултан");
            students.add("Турат агай");
            students.add("Ырыскелди");
            students.add("Улан уулу");
            students.add("Жамал");
            students.add("Жаңыл");

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

