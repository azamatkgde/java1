package abstractclass.Zhanna;

abstract class Vehicle {
    protected int speed;
    protected String color;

    public Vehicle(int speed, String color) {
        this.speed = speed;
        this.color = color;
    }
    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public void stop() {
        System.out.println("The transport stopped");
    }

    public abstract void startEngine();
}
