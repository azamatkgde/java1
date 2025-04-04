package basics.asan;

import java.util.Scanner;

public class CatStore {
    public static void main(String[] args) {
        int san = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Канча мышык: ");
        int summa = scanner.nextInt();
        scanner.nextLine();

        Sale[] cats = new Sale[summa];
        //Cat[] cats = new Cat[summa];

        for (int i = 0; i < cats.length; i++) {
            System.out.println("Магазинге жаңы мышык кошуңуз: " + (i + 1) + ":");

            System.out.println("Аты: ");
            String name = scanner.nextLine();

            System.out.println("Түсү: ");
            String light = scanner.nextLine();

            System.out.println("Жашы: ");
            int age = scanner.nextInt();

            System.out.println("Баасы: ");
            int price = scanner.nextInt();

            System.out.println("Жеткире турган баасы: ");
            int price1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Адреси: ");
            String location = scanner.nextLine();

            cats[i] = new Sale(name, light, age, price, price1, location);
        }


        for (int i = 0; i < cats.length; i++) {
            System.out.println("Магазиндеги мышыктар: ");
            cats[i].printSale();
        }

        scanner.close();
    }
}