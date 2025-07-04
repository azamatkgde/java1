package collections.erlan;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main (String[] args) {
        List <String> students = new ArrayList<>();
        students.add("Омка");
        students.add("Эрлан");
        students.add("Ажибай");
        students.add("Айзат");
        students.add("Байма");
        students.add("Бексултан");
        students.add("Турат агай");
        students.add("Ырыскелди");
        students.add("Улан уулу");
        students.add("Жамал");
        students.add("Жаңыл");

        System.out.println(students.get(0));
        System.out.println(students);

    }
}

