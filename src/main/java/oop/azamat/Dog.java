package oop.azamat;

public class Dog {
    private String race;
    private int weight;
    private String name;
    private boolean canNotEat;

    // Getter
    public String getRace() {
        return race;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public boolean getCanNotEat() {
        return canNotEat;
    }

    // Setter
    public void setRace(String race) {
        this.race = race;
    }

    public void setWeight(int weight) {
        if (weight >= 0 && weight <= 150) {
            this.weight = weight;
        } else {
            System.out.println("Туура жаз!");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCanNotEat(boolean canNotEat) {
        this.canNotEat = canNotEat;
    }

    public void sayGav() {
        System.out.println(name + " атындагы " + weight + " кг " + race + " рассаындагы ит биздин үйгө келди!");
    }
}
