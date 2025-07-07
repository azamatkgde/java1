package basics.erlan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player[] players = new Player[1];
        Transfer[] transfers = new Transfer[1];
        int playerCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Добавить игрока");
            System.out.println("2. Показать всех игроков");
            System.out.println("3. Подсчитать общее число голов");
            System.out.println("4. Найти самого дорогого игрока");
            System.out.println("5. Выход");
            System.out.print("Выберите опцию: ");

            int choice = scanner.nextInt();

            if (choice == 1) {
                if (playerCount < players.length) {
                    scanner.nextLine(); // очистка

                    System.out.print("Имя: ");
                    String name = scanner.nextLine();

                    System.out.print("Возраст: ");
                    int age = scanner.nextInt();

                    scanner.nextLine(); // очистка
                    System.out.print("Позиция: ");
                    String position = scanner.nextLine();

                    System.out.print("Голов: ");
                    int goals = scanner.nextInt();

                    System.out.print("Цена трансфера ($): ");
                    double price = scanner.nextDouble();

                    Player player = new Player(name, age, position, goals);
                    players[playerCount] = player;
                    transfers[playerCount] = new Transfer(player, price);
                    playerCount++;

                    System.out.println("Игрок добавлен!");

                } else {
                    System.out.println("Состав переполнен. Добавление нового игрока невозможно!!!");
                }
            } else if (choice == 2) {
                for (int i = 0; i < playerCount; i++) {
                    players[i].showInfo();
                }

            } else if (choice == 3) {
                int totalGoals = 0;
                for (int i = 0; i < playerCount; i++) {
                    totalGoals += players[i].getGoalsScored();
                }
                System.out.println("Всего голов: " + totalGoals);

            } else if (choice == 4) {
                if (playerCount == 0) {
                    System.out.println("Игроки отсутствуют.");
                    continue;
                }

                Transfer mostExpensive = transfers[0];
                for (int i = 1; i < playerCount; i++) {
                    if (transfers[i].getPrice() > mostExpensive.getPrice()) {
                        mostExpensive = transfers[i];
                    }
                }

                System.out.println("Самый дорогой игрок:");
                mostExpensive.getPlayer().showInfo();
                System.out.println("Цена: $" + mostExpensive.getPrice());

            } else if (choice == 5) {
                System.out.println("Выход...");
                break;

            } else {
                System.out.println("Неверный ввод. Попробуйте снова.");
            }
        }

        scanner.close();
    }
}