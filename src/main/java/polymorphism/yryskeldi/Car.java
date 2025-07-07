package polymorphism.yryskeldi;

public class Car extends Transport {
    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println(name + " (Машина) жолдо ылдам баратат — " + speed + " км/с!");
    }
}

