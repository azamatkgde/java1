package oop.meerim;


import java.util.Date;

public class PersonMain {
    public static void main(String[] args) {


        Person alex  = new Person();
        alex.setName("Alex");
        System.out.println(alex.getName());
        alex.setLastName("Fox");
        System.out.println(alex.getLastName());
        alex.setInn("123");
        alex.greetings();
        Date d1 = new Date();
        d1.setYear(1983 - 1900);
        d1.setMonth( 5  - 1);
        d1.setDate(3);

        System.out.format("I was born  %d/%d/%d \n",   d1.getDate(), d1.getMonth() +1 , d1.getYear() + 1900  );
        Date now = new Date();
        int age1 =  now.getYear() - d1.getYear();
        System.out.println("I am " + age1 + "years old");


        Person roberto = new Person();
        roberto.setName("Roberto");
        roberto.setLastName("Verdi");
        roberto.setInn("567890");
        roberto.greetings();
        Date d = new Date();
        d.setYear(1969 - 1900);
        d.setMonth( 7  - 1);
        d.setDate(4);

        System.out.format("I was born  %d/%d/%d \n",   d.getDate(), d.getMonth() +1 , d.getYear() +1900  );
        // Date now = new Date();
        int age =  now.getYear() - d.getYear();
        System.out.println("I am " + age + "years old");
    }
}