package api.azamat.weather;

public class WeatherService {
    public Weather getWeather(String city) {
        if (city.equalsIgnoreCase("Berlin")) {
            return new Weather(city, "+17°C", "Ачык");
        } else if (city.equalsIgnoreCase("Bishkek")) {
            return new Weather(city, "+22°C", "Булуттуу");
        } else {
            return new Weather(city, "??", "Маалымат жок");
        }
    }
}
