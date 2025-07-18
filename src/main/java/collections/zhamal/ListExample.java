package collections.zhamal;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main (String[]args){
        List<String> Student = new ArrayList<>();
        Student.add( " Alex Müller");
        Student.add(" Asel Bakyt");
        Student.add(" Neli Nils");

        System.out.println(Student.get(2));
        System.out.println(Student);
    }
}
