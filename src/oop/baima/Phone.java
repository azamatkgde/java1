package oop.baima;

public class Phone {
    // Инкапсулация талаалар
    private  String brand;
    private String model;
    private double price;

    // Конструктор - жаны телефон тузуу учун
    public Phone(String brand, String model, int price ) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Геттер - маалымат алуу учун
    public String getBrand() {
        return brand;
    }
    public String getModel (){
        return model;
    }
    public double getPrice(){
        return price;
    }
     public void printInfo(){
        System.out.println("Brand: "+ brand);
        System.out.println("Model: "+ model);
        System.out.println("Price: $"+price);
         System.out.println("--------");
     }

}
