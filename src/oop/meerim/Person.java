package oop.meerim;

import java.util.Date;
public class Person {
    private String lastName;
    private String name;
    private String inn;
    private Date dateOfBirthday;

    Person() {
        System.out.println();
        this.dateOfBirthday = new Date();
    }

    public Person(String lastName, String name, String inn, Date dateOfBirthday) {
        this.lastName = lastName;
        this.name = name ;
        this.inn = inn;
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public Date getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(Date dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;

    }

    public void greetings() {
        System.out.println("Ciao, i am : " + this.name + " " + this.lastName + "  " + this.inn);
    }
}
