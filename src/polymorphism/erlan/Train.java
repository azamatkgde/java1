package polymorphism.erlan;

class Train extends Transport {
    @Override
    void move() {
        System.out.println("Train is running on the rails...");
    }
}
