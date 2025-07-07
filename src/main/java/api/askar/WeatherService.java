package api.askar;

public class WeatherService {
    public Weather getWeather(String city) {
        if (city.equalsIgnoreCase("Frankfurt")) {
            return new Weather("Frankfurtta", 18, "Kün chygyp turat, birok jenil schamal bar");
        } else if (city.equalsIgnoreCase("Berlin")) {
            return new Weather("Berlinde", 15, "Aba yraiy turuktuu emes, jamgyr jaaschy mumkun");
        } else {
            return new Weather(city, 20, "Aba yraiy ozgoruschu mumkun");
        }
    }
}

