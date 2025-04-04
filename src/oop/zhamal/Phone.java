package oop.zhamal;

public class Phone {

        // inkap
        private String brand;
        private String model;
        private double price;

        // Konstruktor - neue Handy

        public Phone(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;       // this - bul konstruktorgo koldongon daiyar Variabl
            this.price = price;
        }
        // getter
        public String getBrand() {
            return brand;
        }
        public String getModel (){
            return model;
        }

        public double getPrice (){
            return price ;
        }

        public void printInfo(){
            System.out.println( " Brand " + brand) ;
            System.out.println( " Model " + model) ;
            System.out.println( " price " + price) ;
        }
}
