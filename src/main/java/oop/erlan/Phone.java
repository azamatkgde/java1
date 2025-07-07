package oop.erlan;

import jdk.jshell.spi.SPIResolutionException;

public class Phone {
    private String brand;
    private String model;
    private double price;

//    Конструктор жаны тел тузуу учун
    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;

//        геттер-маалымат учун
   }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

//    сеттер - маалымат беруу учун

    public void printInfo () {
        System.out.println("Brand " + brand);
        System.out.println("Model " + model);
        System.out.println("Price " + price);
    }
}
