package oop.aibek;


public class CarsImpl {
    public static void main(String[] args) {
        Cars car = new Cars();
        car.setModel("Audi Q3 ");
        car.setYear(2025);


        System.out.println("Машинанын модели: " + car.getModel() + "\nЧыгарылган жылы: " + car.getYear());
    }

}
