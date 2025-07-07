package oop.aizat;

public class CarKonstructor {
   private String name;
   private int year;
   private String color;
   private String origin;
   private String make;


    public CarKonstructor(String name, int year, String color, String origin, String make){
        this.name = name;
        this.year = year;
        this.color = color;
        this.origin = origin;
        this.make = make;
    }


   public void Mashin() {
        System.out.println("Название машины:" + name + "\n" + "Год выпуска машины:" +year + "\n" +
                "Цвет машины:" + color + "\n" + "Происхождение машины:" + origin + "\n" + "Марка машины:" + make);
    }



}
