package polymorphism.erlan;

class Bike extends Transport {
    @Override
    void move() {
        System.out.println("Bike is cycling on the track...");
    }
}
