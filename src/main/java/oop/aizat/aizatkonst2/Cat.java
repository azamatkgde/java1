package oop.aizat.aizatkonst2;

public class Cat extends Animal {
    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String color() {
        return color;
    }

    public void printCatInfo(){
        super.printAnimalInfo();
        System.out.println("Color: " + color);
    }
}
