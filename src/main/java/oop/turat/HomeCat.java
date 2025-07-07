package oop.turat;

public class HomeCat extends Cat {
    String race;
    int weight;

    public HomeCat(String name, int age, String race, int weight) {
        super(name, age);
        this.race = race;
        this.weight = weight;
    }
}
