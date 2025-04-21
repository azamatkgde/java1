package basics.azamat.begimai;

import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private String group;
    private String profession;

   //konstruktor bez param
    public Student() {
        this.name = "unbekant";
    }

   //konstruktor s parametrom
    public Student(String name, int age, String group, String profession) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getProfession() {
        return profession;

    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

//System.out.println("Name; " + student.getName());
    //System.out.println("Alter; " + student.getAge());
    //System.out.println("Gruppe; " + student.getGroup());
    //System.out.println("Beruf; " + student.getProfession());
    //System.out.println("Preis " + contract.getPrice());

}
