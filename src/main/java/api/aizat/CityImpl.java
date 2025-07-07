package api.aizat;

public class CityImpl {
    public static void main(String[] args) {
        CityInfoService service = new CityInfoService();

        City p = service.getCityInfo("Москва");
        p.print();

        System.out.println("--- Все города ---");
        for (City city : service.getAllCities()) {
            city.print();
            System.out.println();
        }
        }

}
