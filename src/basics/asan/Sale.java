package basics.asan;

public class Sale extends Cat {
    private int price;
    private double price1; // доставка = deliveryCost
    private String location;

    public Sale(String name, String light, int age, int price, double price1, String location) {
        super(name, light, age);
        this.price = price;
        this.price1 = price1;
        this.location = location;
    }

    public int getPrice(){
        return price;
    }

    public double getPrice1(){
        return price1;
    }

    public String getLocation(){
        return location;
    }

    public void printSale() {
        super.profilCat();
        System.out.println("Баасы " + price);
        System.out.println("Доставка " + price1);
        System.out.println("Адрес " + location);
    }
}
