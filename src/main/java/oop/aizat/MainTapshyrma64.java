package oop.aizat;

public class MainTapshyrma64 {
    public static void main(String[] args) {
        Car world = new Car();
        world.carName = "BMW12345abc";
        world.carYear = 2025;
        world.carColor = "Black-Grey";
        world.carOrigin = "Germany";
        world.carMake = "BMW";
        world.Mashiny();

        Car salam = new Car();
        salam.SecondObject();
        salam.carName = "Tesla6789abc";
        salam.carYear = 2022;
        salam.carColor = "Red";
        salam.carOrigin = "USA";
        salam.carMake = "Tesla";
        salam.Mashiny();

        Car hello = new Car();
        hello.ThirdObject();
        hello.carName = "Toyota567abc";
        hello.carYear = 2024;
        hello.carColor = "White";
        hello.carOrigin = "Japan";
        hello.carMake = "Toyota";
        hello.Mashiny();
    }
}
