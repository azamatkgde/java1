package basics.yryskeldi;

public class Vehicle {
    private String model;

    // Конструктор
    public Vehicle(String model) {
        this.model = model;
    }

    // Геттер
    public String getModel() {
        return model;
    }

    // Метод
    public void printInfoTransport() {
        System.out.println("Эй кандайсың?: " + model);
    }
}
