package api.askar;

public class Weather {
    private String city;
    private int temperature;
    private String description;

    public Weather(String city, int temperature, String description) {
        this.city = city;
        this.temperature = temperature;
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getDescription() {
        return description;
    }
}

