package api.azamat.person;

public class PersonService {

    // Возвращает одного человека по имени
    public Person getPersonByName(String name) {
        if (name.equalsIgnoreCase("Aibek")) {
            return new Person("Aibek", 30);
        } else if (name.equalsIgnoreCase("Aisuluu")) {
            return new Person("Aisuluu", 25);
        } else {
            return new Person(name, 0); // Неизвестный возраст
        }
    }

    // Возвращает список людей (массив или список — можно расширять)
    public Person[] getAllPeople() {
        return new Person[] {
                new Person("Aibek", 30),
                new Person("Aisuluu", 25),
                new Person("Ermek", 35)
        };
    }
}
