package api.aizat;

public class CityInfoService {
    public City getCityInfo(String cityName) {
        if (cityName.equalsIgnoreCase("Сеул")) {
            return new City("Сеул", "Южная Корея", 9500000, 605.21);
        } else if (cityName.equalsIgnoreCase("Токио")) {
            return new City("Токио", "Япония", 13960000, 2194.07);
        } else if (cityName.equalsIgnoreCase("Москва")) {
            return new City("Москва", "Россия", 12600000, 2561.5);
        } else {
            return new City(cityName, "Неизвестно", 0, 0.0);
        }
    }


    public City[] getAllCities() {
        return new City[] {
                new City("Сеул", "Южная Корея", 9500000, 605.21 ),
                new City("Токио", "Япония", 13960000, 2194.07),
                new City("Москва", "Россия", 12600000, 2561.5)
        };
    }


}
