package oop.aizat;

public class CarGetSet {
    private String name;
    private int year;
    private String color;
    private String origin;
    private String make;

    //Getter
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getOrigin() {
        return origin;
    }

    public String getMake() {
        return make;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setYear(int year){
        this.year = year;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setOrigin(String origin){
        this.origin = origin;
    }

    public void setMake(String make){
        this.make = make;
    }

    // Конструктор с параметрами
    public CarGetSet(String name, int year, String color, String origin, String make) {
        this.name = name;
        this.year = year;
        this.color = color;
        this.origin = origin;
        this.make = make;
    }
    // Пустой (дефолтный) конструктор
    public CarGetSet() {
        System.out.println("\n----- Первый объект -----");
    }
}
