package oop.asel;

public class CarPrivate {

    private String model;
    private int year;

    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void buyCar() {
        System.out.println("My car is " + model + " which is released in " + year);
    }
}
