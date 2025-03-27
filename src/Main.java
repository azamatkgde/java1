import oop.askar.Car;

     public class Main {
            public static void main(String[] args) {
                Car myCar = new Car("Toyota", 60);
                myCar.showInfo(); // Автомобиль: Toyota, Скорость: 60 км/ч
                myCar.accelerate(20); // Toyota ускоряется. Теперь скорость: 80 км/ч
            }
    }
