package basics.yryskeldi;

public class Car extends Vehicle {
    private String fuelType;

    // Конструктор
    public Car(String model, String fuelType) {
        super(model);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void printInfo() {
        super.printInfoTransport();
        System.out.println("Отун түрү: " + fuelType);
    }
}
