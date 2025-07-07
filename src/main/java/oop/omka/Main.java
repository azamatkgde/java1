// Version 1.0
package oop.omka;

public class Main {
    public static void main(String[] args){
        Car car1 = new Car();
        car1.setMarka("Toyota");
        car1.setPreis(5000);

        Car car2 = new Car("BMW", 10000);
        car1.all();
        car2.all();

        // Setter
        car1.setPreis(7000);
        System.out.println("Жаңыртылган баасы: " + car1.getPreis() + " доллар");
    }
}
// Ozgortuu