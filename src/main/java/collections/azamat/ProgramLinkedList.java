package collections.azamat;

import java.util.LinkedList;

public class ProgramLinkedList {
    public static void main(String[] args) {

        LinkedList<String> countries = new LinkedList<>(); // Иницализация кылдык

        countries.add("Кыргызстан");
        countries.add("Германия");
        countries.addFirst("Россия");
        countries.addLast("Италия");
        countries.add(2, "Португалия");

        System.out.println(countries);
        System.out.println(countries.size());

        for (String country : countries) {
            System.out.println(country);
        }

        if (countries.contains("Германия")) {
            System.out.println("Биздин тизмеде Германия бар!");
        }

        countries.removeFirst();
        countries.removeLast();
        System.out.println(countries);


        LinkedList<Person> people = new LinkedList<>();
        people.add(new Person("Өмүрбек"));
        people.addLast(new Person("Бекболот"));
        people.addFirst(new Person("Азамат"));

        for (Person p : people) {
            System.out.println(p.getName());
        }

        people.remove(0);

        Person first = people.getFirst();
        System.out.println(first.getName());
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
