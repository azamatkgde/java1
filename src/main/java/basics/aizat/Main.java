package basics.aizat;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            CarSalon salon = new CarSalon(100); // массив өлчөмү

            salon.addCar(new Car("Арстан", "Toyota", "Camry", 2022, 25000));
            salon.addCar(new Car("Жолборс", "BMW", "X5", 2023, 55000));
            salon.addCar(new Car("Бүркүт", "Kia", "K5", 2020, 21000));
            salon.addCar(new Car("Четин", "Hyundai", "Sonata", 2021, 22000));
            salon.addCar(new Car("Касырга", "Mercedes", "E-Class", 2023, 60000));

            boolean running = true;

            while (running) {
                System.out.println("\n=== Машине сатуучу салон ===");
                System.out.println("1. Машина кошуу");
                System.out.println("2. Салондогу бардык машиналарды көрсөтүү");
                System.out.println("3. Салондогу жалпы машиналардын бириккен баасы");
                System.out.println("4. Машина кайсыл баадан жогоруу болуусу керек");
                System.out.println("5. Чыгуу");
                System.out.print("Тандооңуз: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Enter тазалоо

                if (choice == 1) {
                    System.out.print("Аты: ");
                    String name = scanner.nextLine();

                    System.out.print("Бренди: ");
                    String brand = scanner.nextLine();

                    System.out.print("Модели: ");
                    String model = scanner.nextLine();

                    System.out.print("Чыгарылган жылы: ");
                    int year = scanner.nextInt();

                    System.out.print("Баасы: ");
                    double price = scanner.nextDouble();

                    Car car = new Car(name, brand, model, year, price);
                    salon.addCar(car);

                } else if (choice == 2) {
                    salon.showAllCars();

                } else if (choice == 3) {
                    double total = salon.getTotalPrice();
                    System.out.println("Бардык машиналардын жалпы баасы: $" + total);

              }    else if (choice == 4) {
                    System.out.print("Минималдуу бааны киргизиңиз: ");
                    double minPrice = scanner.nextDouble();
                    scanner.nextLine(); // Enter тазалоо
                    //System.out.print("Баасы сиз корсоткон суммадан жогору машиналар: \n" );
                    salon.findExpensiveCars(minPrice);

                }  else if (choice == 5) {
                    System.out.println("Чыгып кеттиниз");
                    running = false;

                } else {
                    System.out.println("Туура эмес тандоо. Кайра аракет кылыңыз.");
                }
            }

            scanner.close();
        }



}
