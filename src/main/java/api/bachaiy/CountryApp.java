package api.bachaiy;

public class CountryApp {
    public static void main(String[] args) {
        CountryService service = new CountryService();
        Country country = service.getCountry("Germany");
        country.print();
    }
}

