package api.azamat;

import api.azamat.person.Person;
import api.azamat.person.PersonService;
import api.azamat.weather.Weather;
import api.azamat.weather.WeatherService;

public class Main {
    public static void main(String[] args) {
        /*WeatherService service = new WeatherService();
        Weather weather = service.getWeather("Bishkek");
        weather.print();*/


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
