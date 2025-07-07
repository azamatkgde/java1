package interfaces.aizat;

public class Main {
    public static void main(String[] args) {

        ShopElec shop = new ShopElec ();

        String smartwatch = shop.getName();
        double smartwatchPrice = shop.getPrice();

        String headphones = shop.getName2();
        double headphonesPrice = shop.getPrice2();

        System.out.println("Название продукта");
        System.out.println("1." + smartwatch + " " + smartwatchPrice + "$");
        System.out.println("2." + headphones + " " + headphonesPrice + "$");

        double total = shop.getPrice() + shop.getPrice2();

        Pay paymentMethod = new Pay();
        paymentMethod.pay(total);
    }
}
