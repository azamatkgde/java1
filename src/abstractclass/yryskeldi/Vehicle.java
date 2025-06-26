package abstractclass.yryskeldi;

public abstract class Vehicle {
        protected int speed;
        protected String color;

        public Vehicle(int speed, String color) {
            this.speed = speed;
            this.color = color;
        }

        public void stop() {
            System.out.println("Транспорт токтоду");
        }

        public abstract void startEngine();
    }


