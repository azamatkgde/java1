package abstractclass.zhanyl;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car(120, "Red");
        Vehicle myBike = new Bike(30, "Blue");

        System.out.println("Car: speed = " + myCar.speed + ", color = " + myCar.color);
        myCar.startEngine();
        myCar.stop();

        System.out.println();

        System.out.println("Bike: speed = " + myBike.speed + ", color = " + myBike.color);
        myBike.startEngine();
        myBike.stop();
    }
}
