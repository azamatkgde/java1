package oop.askar;

public class Auto {
    private String brand;
    private int year;
    private double price;

    // Конструктор
    public Auto(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    // Геттеры
    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    // Сеттеры
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Метод для вывода информации о машине
    public void displayInfo() {
        System.out.println("Марка: " + brand);
        System.out.println("Год выпуска: " + year);
        System.out.println("Цена: " + price + " евро");
    }

    public static void main(String[] args) {
        // Создаем объект машины
        Auto myCar = new Auto("Mercedes", 2008, 8000);

        // Выводим информацию о машине
        myCar.displayInfo();

        // Изменяем цену машины
        myCar.setPrice(7500);
        System.out.println("\nНовая цена после скидки: " + myCar.getPrice() + " евро");
    }
}