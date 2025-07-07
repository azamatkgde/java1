package oop.erlan;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName ("Erlan");
        p.setAge(31);

        p.sagHallo();

        System.out.println("Аты: " + p.getName());
        System.out.println("Жашы: " + p.getAge());
//        ggg
    }
}
