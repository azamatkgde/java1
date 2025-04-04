package oop.asan;

public class Smartphone extends Phone{
    private boolean hastCamera;

    //Смартфон конструктор
    public Smartphone(String brand,boolean hastCamera){
        super(brand);
        this.hastCamera = hastCamera;
    }
    public boolean hasCamera(){
            return hastCamera;
    }
    public void printSmartphoneInfo(){
            super.printInfo();
            System.out.println("Камера барбы:" + (hastCamera ? "ооба":"жок"));
    }
}
