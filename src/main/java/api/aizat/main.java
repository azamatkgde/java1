package api.aizat;

public class main {
    public static void main(String[] args) {
        PersonService service = new PersonService();
        Person p = service.getPersonByName("Aibek");
        p.print();
        System.out.println("--- Все люди ---");
        for (Person person : service.getAllPeople()) {
            person.print();
            System.out.println();
        }
    }
}
