package enums.aizat;

public enum Transport {
    CAR(100),
    BIKE(20),
    TRAIN(200);

    private int speed;

    Transport(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void move() {
        System.out.println("Двигается со скоростью " + speed + " км/ч");
    }
}
