package basics.azhibai;

import java.util.Scanner;

public class DogShop {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                Dog[] dogs = new Dog[10];

                // 5 чоң ит
                dogs[0] = new Dog("Бөрү", 3, "Немец овчаркасы", 25000);
                dogs[1] = new Dog("Кумайык", 4, "Ротвейлер", 30000);
                dogs[2] = new Dog("Рэкс", 5, "Доберман", 28000);
                dogs[3] = new Dog("Шарик", 2, "Алабай", 22000);
                dogs[4] = new Dog("Мухтар", 6, "Бульмастиф", 35000);

                // 5 күчүк
                dogs[5] = new Puppy("Акжол", 1, "Алабай", 15000, true);
                dogs[6] = new Puppy("Карагул", 1, "Лабрадор", 18000, false);
                dogs[7] = new Puppy("Снуппи", 1, "Пудель", 12000, true);
                dogs[8] = new Puppy("Лаки", 1, "Бигль", 17000, true);
                dogs[9] = new Puppy("Жолборс", 1, "Терьер", 16000, false);

                // Колдонуучуну тосуп алуу
                System.out.println("Биздин ит магазинге кош келиңиз!");
                System.out.println("Чоң ит аласызбы же күчүк аласызбы?");
                System.out.print("Эгер ит алсаңыз 1 баскычын, күчүк алсаңыз 2 баскычын басыңыз!");

                int choice = scanner.nextInt();

                if (choice == 1) {
                    System.out.println("\nБиздин магазиндеги чоң иттер:");
                    System.out.println("----------------------------");
                    for (int i = 0; i < 5; i++) {
                        dogs[i].displayInfo();
                        System.out.println("----------------------------");
                    }

                    // Эң кымбат жана эң арзан итти табуу
                    Dog mostExpensiveBigDog = dogs[0];
                    Dog cheapestBigDog = dogs[0];

                    for (int i = 0; i < 5; i++) {  // Чоң иттерди карап чыгуу
                        if (dogs[i].getPrice() > mostExpensiveBigDog.getPrice()) {
                            mostExpensiveBigDog = dogs[i];
                        }
                        if (dogs[i].getPrice() < cheapestBigDog.getPrice()) {
                            cheapestBigDog = dogs[i];
                        }
                    }

                    // Эң кымбат жана эң арзан итти көрсөтүү
                    System.out.println("\nЭң кымбат же эң арзан итти көргүңүз келеби?");
                    System.out.println("1 баскычы эң кымбат ит");
                    System.out.print("2 баскычы эң арзан ит");
                    int viewChoice = scanner.nextInt();

                    if (viewChoice == 1) {
                        System.out.println("\nЭң кымбат чоң ит:");
                        mostExpensiveBigDog.displayInfo();
                    } else if (viewChoice == 2) {
                        System.out.println("\nЭң арзан чоң ит:");
                        cheapestBigDog.displayInfo();
                    } else {
                        System.out.println("Кечиресиз, туура эмес тандоо!");
                    }

                } else if (choice == 2) {
                    System.out.println("\nБиздин магазиндеги күчүктөр:");
                    System.out.println("----------------------------");
                    for (int i = 5; i < 10; i++) {
                        dogs[i].displayInfo();
                        System.out.println("----------------------------");
                    }

                    // Эң кымбат жана эң арзан күчүктү табуу
                    Puppy mostExpensivePuppy = (Puppy) dogs[5];  // Күчүктөр үчүн
                    Puppy cheapestPuppy = (Puppy) dogs[5];        // Күчүктөр үчүн

                    for (int i = 5; i < 10; i++) {  // Күчүктөрдү карап чыгуу
                        if (dogs[i].getPrice() > mostExpensivePuppy.getPrice()) {
                            mostExpensivePuppy = (Puppy) dogs[i];
                        }
                        if (dogs[i].getPrice() < cheapestPuppy.getPrice()) {
                            cheapestPuppy = (Puppy) dogs[i];
                        }
                    }

                    // Эң кымбат жана эң арзан күчүктү көрсөтүү
                    System.out.println("\nЭң кымбат же эң арзан күчүктү көргүңүз келеби?");
                    System.out.println("1 баскычы эң кымбат күчүк");
                    System.out.print("2 баскычы эң арзан күчүк");
                    int puppyViewChoice = scanner.nextInt();

                    if (puppyViewChoice == 1) {
                        System.out.println("\nЭң кымбат күчүк:");
                        mostExpensivePuppy.displayInfo();
                    } else if (puppyViewChoice == 2) {
                        System.out.println("\nЭң арзан күчүк:");
                        cheapestPuppy.displayInfo();
                    } else {
                        System.out.println("Кечиресиз, туура эмес тандоо!");
                    }
                } else {
                    System.out.println("Кечиресиз, туура эмес тандоо!");
                }
        System.out.println("\nРахмат! Биздин магазинге кайра келиңиз!");


        scanner.close();
            }
        }







