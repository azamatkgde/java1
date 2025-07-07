package polymorphism.yryskeldi;

public class Transport {
    protected String name;
    protected int speed;

    public Transport(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void move() {
        System.out.println(name + " жүрүп жатат ылдамдыкта " + speed + " км/с");
    }

    public void info() {
        System.out.println("Транспорт: " + name + ", Ылдамдыгы: " + speed + " км/с");
    }
}

