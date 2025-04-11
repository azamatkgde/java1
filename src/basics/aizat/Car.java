package basics.aizat;

public class Car {

        private String name;
        private String brand;
        private String model;
        private int year;
        private double price;

        public Car(String name, String brand, String model, int year, double price) {
            this.name = name;
            this.brand = brand;
            this.model = model;
            this.year = year;
            this.price = price;
        }

        // Getter'лер
        public String getName() {
            return name;
        }

        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getYear() {
            return year;
        }

        public double getPrice() {
            return price;
        }

        public String toString() {
            return name + " - " + brand + " " + model + " (" + year + ") $" + price;
        }


}
