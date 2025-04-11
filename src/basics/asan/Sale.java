package basics.asan;

public class Sale extends Cat {
    private int price;
    private double deliverPrice; // доставка = deliveryCost
    private String location;

    public Sale(String name, String light, int age, int price, double deliverPrice, String location) {
        super(name, light, age);
        this.price = price;
        this.deliverPrice = deliverPrice;
        this.location = location;
    }

    public int getPrice(){
        return price;
    }

    public double getDeliverPrice(){
        return deliverPrice;
    }

    public String getLocation(){
        return location;
    }

    public void printSale() {
        super.profilCat();
        System.out.println("Баасы " + price);
        System.out.println("Доставка " + deliverPrice);
        System.out.println("Адрес " + location);
    }
}
