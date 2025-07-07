package api.erlan;

public class WeatherService {
    public Weather getWeather(String city) {
        // "Фиктивные данные" — имитация ответа от API
        if (city.equalsIgnoreCase("Berlin")) {
            return new Weather(city, "+17°C", "Ясно");
        } else if (city.equalsIgnoreCase("Bishkek")) {
            return new Weather(city, "+22°C", "Облачно");
        } else {
            return new Weather(city, "??", "Нет данных");
        }
    }
}
