package oop.aibek;


public class Dog {
    String name;
    String race;
    int weight;

    //Getter
    public String getName(){
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getWeight() {
        return weight;
    }

    //Setter


    public void setName(String name) {
        this.name = name;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setWeight(int weight) {
        if (weight >= 0 && weight <= 50 ){
            this.weight = weight;
        }else {
            System.out.println("Салмагын туура жаз: 0 - 50 кг аралыгында болушу керек. ");
        }
    }
    public void sayGav() {
        System.out.println(race + " породасындагы " + name  + " деген " + weight + " салмактагы  ит багып алдык ");
    }

}


