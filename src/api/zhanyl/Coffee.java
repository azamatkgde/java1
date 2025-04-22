package api.zhanyl;

public class Coffee {
    private String name;
    private double price;
    private String size;
    public Coffee (String name ,double price,String size ){
        this.name=name;
        this.price =price ;
        this.size =size ;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void showInfo() {
        System.out.println("Кофе: " + name + ", Баасы: " + price + "€ "+"Өлчөмү: "+size );
    }
}
