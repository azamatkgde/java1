package interfaces.aizat;

public class ShopElec implements Product {
    @Override
    public double getPrice() {
        return 30;
    }

    @Override
    public String getName() {
        return "Электронные часы";
    }

    @Override
    public double getPrice2() {
        return 20;
    }

    @Override
    public String getName2() {
        return "Наушники";
    }


}
