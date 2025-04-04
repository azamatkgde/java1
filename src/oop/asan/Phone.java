package oop.asan;

public class Phone {
    private String brand;

    //Конструктор
    public Phone(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void printInfo(){
        System.out.println("Brand" + brand);
    }
}
