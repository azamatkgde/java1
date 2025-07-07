package api.erlan;

public class Main {
    public static void main(String[] args) {
        WeatherService service = new WeatherService();
        Weather weather = service.getWeather("Berlin");
        weather.print();
    }
}
