package polymorphism.yryskeldi;

public class Train extends Transport {
    public Train(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void move() {
        System.out.println(name + " (Поезд) зуулдап рельстер менен кетүүдө — " + speed + " км/с!");
    }
}

