package oop.zhanyl;
public class FlowerShop extends Flower  {
    public String floristName;
    public String location ;
    // Дефолттук конструктор
    public FlowerShop () {
        this.floristName= " Rosella";
        this.location  = "Lübeck";
    }
    // Параметр менен конструкторду колдонуу
    public FlowerShop(String floristName , String location) {
            this.floristName = floristName;
            this.location = location;
    }
    // Гүлдү сатуу
    public void sellFlower() {
        System.out.println("Гүл сатыла баштады...");
        System.out.println("Сатып алуу процессин аткарууда...");
    }
}