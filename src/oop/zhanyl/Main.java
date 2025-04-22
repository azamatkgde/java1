package oop.zhanyl;
import java.time.LocalTime;

public class Main {
    public static void main(String []args){
        // Дефолттук конструктор
        FlowerShop shop = new FlowerShop();
        System.out.println("Гүл дүкөнү: " + shop.floristName);
        System.out.println("Жайгашкан жери: " + shop.location);
        // Параметр менен конструкторду колдонуу
        FlowerShop customShop = new FlowerShop("Rosella", "Lübeck");
        System.out.println("Гүл дүкөнү: " + customShop.floristName);
        System.out.println("Жайгашкан жери: " + customShop.location);
        //Иштоо убактысы
        LocalTime startTime=LocalTime.of(10,0);
        LocalTime endTime=LocalTime.of(18,0);
        LocalTime nowTime=LocalTime.now();
        if (nowTime.isAfter(startTime)&& nowTime.isBefore(endTime)){
            System .out .println("Ачык");
        }else {
            System .out .println("Жабык");
        }
        shop.sellFlower();

        Flower flower =new Flower();
        flower.setName("Роза");
        flower.setColor("кызыл");
        flower.setPrice(2);
        flower.setQuantity(15);
        flower.all();
        System.out .println("Жалпы баасы: "+flower.calculateTotalPrice());


    }



}
