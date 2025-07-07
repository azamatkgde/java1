package oop.urmat;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Урмат");
        person.setAge(37);

        person.sayHello();
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        System.out.println();


        Apartment apartment = new Apartment();
        apartment.setTown("Бишкек");
        apartment.setRooms(2);
        apartment.setPartOfTown("Восток-5");

        System.out.println("Шаар: " + apartment.getTown());
        System.out.println("Район: " + apartment.getPartOfTown());
        System.out.println("Болмо: " + apartment.getRooms());

        apartment.searchRooms();
    }
}