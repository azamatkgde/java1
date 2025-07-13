package records.azamat;

import java.util.HashSet;
import java.util.Set;

public class Uni {
    public static void main(String[] args) {
        Person person1 = new Person("Бекболот", 32);
        Person person2 = new Person("Ырыскелди", 19);

        System.out.println(person1);
        System.out.println(person2);

        Set<Person> persons = new HashSet<>();

        Student student = new Student("Гульнур", 26);
        System.out.println(student.age() + student.name());

        Set<Student> students = new HashSet<>();
        students.add(student);
        System.out.println(students);

    }
}
