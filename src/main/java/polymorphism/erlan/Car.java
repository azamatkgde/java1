package polymorphism.erlan;

class Car extends Transport {
    @Override
    void move() {
        System.out.println("Car is driving on the road...");
    }
}
