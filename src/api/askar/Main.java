package api.askar;

public class Main {
    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService();

        Weather frankfurtWeather = weatherService.getWeather("Frankfurt");

        System.out.println("City: " + frankfurtWeather.getCity());
        System.out.println("Temperature: " + frankfurtWeather.getTemperature() + "°C");
        System.out.println("Description: " + frankfurtWeather.getDescription());
    }
}


