package api.erlan;

public class Weather {
    String city;
    String temperature;
    String description;

    public Weather(String city, String temperature, String description) {
        this.city = city;
        this.temperature = temperature;
        this.description = description;
    }
    public void print() {
        System.out.println("Город: " + city);
        System.out.println("Температура: " + temperature);
        System.out.println("Описание: " + description);
    }
}
