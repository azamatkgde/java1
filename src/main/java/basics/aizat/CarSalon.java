package basics.aizat;

public class CarSalon {

        private Car[] mashinalar;
        private int count;

        public CarSalon(int size) {
            mashinalar = new Car[size];
            count = 0;
        }

        public void addCar(Car mashinaKoshuu) {
            if (count < mashinalar.length) {
                mashinalar[count] = mashinaKoshuu;
                count++;
            }
        }

        public void showAllCars() {
            if (count == 0) {
                System.out.println("Салондо азырынча машиналар жок.");
            } else {
                for (int i = 0; i < count; i++) {
                    System.out.println((i + 1) + ". " + mashinalar[i]);
                }
            }
        }

        public double getTotalPrice() {
            double sumPrice = 0;
            for (int i = 0; i < count; i++) {
                sumPrice += mashinalar[i].getPrice();
            }
            return sumPrice;
        }

        public void findExpensiveCars(double minPrice) {  //параметр
            boolean found = false; // машиналар табыла элек
            for (int i = 0; i < count; i++) {
                if (mashinalar[i].getPrice() >= minPrice) {
                    System.out.println(mashinalar[i]);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Көрсөтүлгөн суммадан кымбат машиналар табылган жок.");
            }
        }


}
