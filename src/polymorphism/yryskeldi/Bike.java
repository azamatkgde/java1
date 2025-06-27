package polymorphism.yryskeldi;

public class Bike extends Transport {
    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println(name + " (Мотоцикл) тынч жана жеңил жүрүп жатат — " + speed + " км/с.");
    }
}

