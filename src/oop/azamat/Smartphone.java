package oop.azamat;

public class Smartphone extends Phone {
    private boolean hasCamera;

    // Смартфон үчүн конструктор
    public Smartphone(String brand, boolean hasCamera) {
        super(brand);
        this.hasCamera = hasCamera;
    }

    public boolean hasCamera() {
        return hasCamera;
    }


    public void printSmartphoneInfo() {
        super.printInfo();
        System.out.println("Камера барбы: " + (hasCamera ? "Ооба" : "Жок"));
    }

}
