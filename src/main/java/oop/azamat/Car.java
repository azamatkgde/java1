package oop.azamat;

public class Car {
    private String model;
    private int year;
    private String color;

    // Getter (Алгыч)
    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    // Setter (Бергич)
    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        if (year < 1900 || year >= 2025) {
            this.year = year;
        } else {
            System.out.println("Туура жылды киргиз!");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + model + " and I'm " + year + " years old. My color is " + color);
    }
}
