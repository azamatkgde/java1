package basics.asan;

import java.util.ArrayList;
import java.util.Scanner;

public class CatStore {
    public static void main(String[] args) {
        int san = 1;
        Scanner scanner = new Scanner(System.in);
        //Динамыкалык массив
        ArrayList<Sale> cats = new ArrayList<>();


        boolean menu = true;

        while (menu) {
            System.out.println("----------Мышыктардын менюсу:---------");
            System.out.println("1.Жаны мышык кошуу: ");
            System.out.println("2.Баардык мышыктарды коруу: ");
            System.out.println("3.Жалпы баасын коруу (баасы + жеткируу): ");
            System.out.println("4.Эн кымбат мышыкты коруу: ");
            System.out.println("5.Эн арзан мышыкты коруу: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    cats.add(addCat(scanner,cats.size()));
                    break;
                case 2:
                    showAllCats(cats);
                    break;
                case 3:
                    getTotal(cats);
                    System.out.println("Жалпы баасы (баасы + жеткируу):" + getTotal(cats));
                    break;
                case 4:
                    findExpensiveCat(cats);
                    break;
                case 5:
                    findCheapestCat(cats);
                    break;
                case 6:
                    menu = false;
                    System.out.println("Программа жабылды: ");
                    break;
                case 7:
                    System.out.println("Кайталап жазыныз: ");
            }
        }

        scanner.close();
    }

    //Мышык кошуу
    public static Sale addCat(Scanner scanner, int nummer) {
        System.out.println("Магазинге жаңы мышык кошуңуз: " + (nummer + 1));

        System.out.println("Аты: ");
        String name = scanner.nextLine();

        System.out.println("Түсү: ");
        String light = scanner.nextLine();

        System.out.println("Жашы: ");
        int age = scanner.nextInt();

        System.out.println("Баасы: ");
        int price = scanner.nextInt();

        System.out.println("Жеткире турган баасы: ");
        int deliverPrice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Адреси: ");
        String location = scanner.nextLine();

        return new Sale(name, light, age, price, deliverPrice, location);
    }

    //Баардык мышыктар
    public static void showAllCats(ArrayList<Sale> cats) {
        System.out.println("\nБардык мышыктар:");
        for (Sale cat : cats) {
            cat.printSale();
            System.out.println("------------------");
        }
    }

    //жалпы сумма
    public static double getTotal (ArrayList<Sale> cats) {
        double total = 0;
        for (Sale cat : cats){
            total = cat.getPrice() + cat.getDeliverPrice();//туура эмес +=
       }
        return total;
    }

    //кымбат мышык
    public static void findExpensiveCat(ArrayList<Sale> cats) {
        Sale max = cats.get(0);
        for (Sale cat : cats){
            if (cat.getPrice() > max.getPrice()){
                max = cat;
            }
        }
        System.out.println("Эн кымбат: мышык ");
        max.printSale();
    }

    //арзан мышык
    public static void findCheapestCat(ArrayList<Sale> cats) {
        Sale min = cats.get(0);
        for (Sale cat : cats){
            if (cat.getPrice() < min.getPrice()){
                min = cat;
            }
        }
        System.out.println("Эн арзан мышык: ");
        min.printSale();
    }
}

