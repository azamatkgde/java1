package enums.zhanna;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SoundMaker> animals = new ArrayList<>();
        boolean running = true;

        while (running) {
            System.out.println("\n=== Жаныбарлар Менюсу ===");
            System.out.println("1. Жаныбар кошуу");
            System.out.println("2. Бардык жаныбарлар үн чыгарсын");
            System.out.println("3. Жаныбарлардын саны");
            System.out.println("4. Чыгуу");
            System.out.print("Тандоо киргизиңиз: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // nextInt() ден кийин жаңы сабакты алып коёбуз

            switch (choice) {
                case 1:
                    System.out.println("Жаныбар түрүн тандаңыз: dog же cat");
                    String type = scanner.nextLine().trim().toUpperCase();

                    System.out.print("Атын жазыңыз: ");
                    String name = scanner.nextLine();

                    if (type.equals("DOG")) {
                        animals.add(AnimalType.DOG.create(name));
                    } else if (type.equals("CAT")) {
                        animals.add(AnimalType.CAT.create(name));
                    } else {
                        System.out.println("Туура эмес жаныбар түрү.");
                    }
                    break;

                case 2:
                    if (animals.isEmpty()) {
                        System.out.println("Жаныбарлар тизмеси бош.");
                    } else {
                        System.out.println("Бардык жаныбарлар үн чыгарып жатат:");
                        for (SoundMaker animal : animals) {
                            animal.makeSound();
                        }
                    }
                    break;

                case 3:
                    System.out.println("Жаныбарлар саны: " + animals.size());
                    break;

                case 4:
                    System.out.println("Программа токтоду.");
                    running = false;
                    break;

                default:
                    System.out.println("Туура эмес тандоо.");
            }
        }

        // while токтогондо жыйынтык чыгаралы
        System.out.println("\nПрограмма аяктады. Жаныбарлар тизмеси:");
        for (int i = 0; i < animals.size(); i++) {
            System.out.print((i + 1) + ". ");
            animals.get(i).makeSound();
        }
    }
}

