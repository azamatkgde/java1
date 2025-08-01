package oop.azamat;

public class Phone {
    private String brand;

    // Конструктор - жаңы телефон түзүү үчүн
    public Phone(String brand) {
        this.brand = brand;
    }

    // Геттер - маалымат алуу үчүн
    public String getBrand() {
        return brand;
    }

    public void printInfo() {
        System.out.println("Brand: " + brand);
    }

    void aboutPhone() {
        System.out.println("Телефон жөнүндө функционал");
    }
}
