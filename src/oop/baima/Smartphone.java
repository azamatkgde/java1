package oop.baima;

public class Smartphone extends Phone {
    private boolean hasCamera;
    private boolean hasInternet;

    // Смартфон учун контруктор
    public Smartphone(String brand, String model, int price, boolean hasCamera, boolean hasInternet) {
    super(brand, model, price); // ата класстык конструктору
    this.hasCamera = hasCamera;
    this.hasInternet = hasInternet;
    }
    public boolean hasCamera(){
        return hasCamera;
    }
    public boolean hasInternet(){
        return hasInternet;
    }
     public void printSmartphoneInfo(){
        super.printInfo();
        System.out.println("Камера барбы?:"+ (hasCamera? "Ооба": "Жок"));
        System.out.println("Интернет барбы:"+(hasInternet? "Ооба": "Жок"));
     }
}
