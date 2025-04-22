package basics.azamat;

import java.util.Scanner;

public class BykeShopApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Bicycle[] bikes = new Bicycle[10]; // 10-чейин велосипеддетрдин массиви
    int count = 0;
    boolean running = true;

    while (running) {
      System.out.println("\n=== Велосипедтердин магазини ===");
      System.out.println("1. Велосипед кошуу");
      System.out.println("2. Баардык велосипедтерди көрүү");
      System.out.println("3. Чыгуу");
      System.out.print("Сан аркылуу меню тандаңыз: ");

      int choice = scanner.nextInt();
      scanner.nextLine(); //

      if (choice == 1) {
        if (count < bikes.length) {
          System.out.print("Моделин жазыңыз: ");
          String model = scanner.nextLine();

          System.out.print("Түрүн тандаңыз (мисалы: тоолук, шаардык): ");
          String type = scanner.nextLine();

          new Bicycle(model, type);
          count++;
          System.out.println("✅ Велосипед кошулду!");
        } else {
          System.out.println("⚠ Магазин толду. Жаңы киргизгенге болбойт!");
        }

      } else if (choice == 2) {
        if (count == 0) {
          System.out.println("Велосипед жок.");
        } else {
          System.out.println("\n=== Баардык велосипедтер ===");
          for (int i = 0; i < count; i++) {
            bikes[i].printInfo();
            System.out.println("------------");
          }
        }

      } else if (choice == 3) {
        System.out.println("Программадан чыгуу...");
        running = false;

      } else {
        System.out.println("Туура эмес. Кайра жазыңыз.");
      }
    }

    scanner.close();
  }
}
