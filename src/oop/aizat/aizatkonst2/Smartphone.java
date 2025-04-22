package oop.aizat.aizatkonst2;

public class Smartphone extends Phone {
    private boolean hasCamera;

    public Smartphone(String brand, boolean hasCamera) {
        super(brand);
        this.hasCamera = hasCamera;
    }

    public boolean hasCamera(){
        return hasCamera;
    }

    public void printSmartphoneInfo(){
        super.printInfo();
        System.out.println("Камера барбы: " + (hasCamera ? "Ооба" : "Жок"));
    }
}
