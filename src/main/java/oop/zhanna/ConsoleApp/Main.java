package oop.zhanna.ConsoleApp;

import java.util.ArrayList;
import java.util.Scanner;

import static oop.zhanna.ConsoleApp.AgeStatisticsApp.ageCategory;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<AgeStatisticsApp.Person> people = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\n--- Меню ---");
            System.out.println("1. Жаңы адам кошуу");
            System.out.println("2. Адамдардын тизмесин көрсөтүү");
            System.out.println("3. Орточо жашты эсептөө");
            System.out.println("4. Категория боюнча статистика");
            System.out.println("5. Чыгуу");
            System.out.print("Тандооңуз: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    System.out.print("Атын жазыңыз: ");
                    String name = scanner.nextLine();

                    int age;
                    while (true) {
                        System.out.print("Жашын жазыңыз: ");
                        age = scanner.nextInt();
                        scanner.nextLine(); // clear newline
                        if (age >= 0) break;
                        else System.out.println("Жаш терс болбошу керек. Кайра аракет кылыңыз.");
                    }
                    people.add(new AgeStatisticsApp.Person(name, age));
                    System.out.println("Адам кошулду.");
                    break;

                case 2:
                    if (people.isEmpty()) {
                        System.out.println("Тизме бош.");
                    } else {
                        System.out.println("Адамдардын тизмеси:");
                        for (AgeStatisticsApp.Person p : people) {
                            System.out.println(p.getName() + " - " + p.getAge() + " жаш, категориясы: " + ageCategory(p.getAge()));
                        }
                    }
                    break;

                case 3:
                    if (people.isEmpty()) {
                        System.out.println("Маалымат жок.");
                    } else {
                        double total = 0;
                        for (AgeStatisticsApp.Person p : people) total += p.getAge();
                        System.out.println("Орточо жаш: " + (total / people.size()));
                    }
                    break;

                case 4:
                    int kids = 0, teens = 0, adults = 0, seniors = 0;
                    for (AgeStatisticsApp.Person p : people) {
                        int a = p.getAge();
                        if (a < 13) kids++;
                        else if (a < 20) teens++;
                        else if (a < 60) adults++;
                        else seniors++;
                    }
                    System.out.println("Балдар: " + kids);
                    System.out.println("Өспүрүмдөр: " + teens);
                    System.out.println("Үй-бүлөлүк: " + adults);
                    System.out.println("Улуу жаштагылар: " + seniors);
                    break;

                case 5:
                    running = false;
                    System.out.println("Программа токтотулду.");
                    break;

                default:
                    System.out.println("Туура эмес тандоо.");
            }
        }
        scanner.close();
    }
}
