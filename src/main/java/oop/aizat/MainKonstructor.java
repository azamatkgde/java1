package oop.aizat;

public class MainKonstructor {
    public static void main(String[] args){
        CarKonstructor world = new CarKonstructor ("BMW12345abc", 2025, "Black-Grey", "Germany", "BMW");
        CarKonstructor salam = new CarKonstructor  ("Tesla6789abc", 2022, "Red", "USA", "Tesla");
        CarKonstructor hello = new CarKonstructor ("Toyota567abc", 2024, "White", "Japan", "Toyota");

        System.out.println("----- Первый объект -----");
        world.Mashin();
        System.out.println("\n----- Второй объект -----");
        salam.Mashin();
        System.out.println("\n----- Третий объект -----");
        hello.Mashin();

    }
}
