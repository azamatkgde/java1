package exeptions.aizat;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        String[] menu = {"Пицца", "Бургер", "Салат", "Рамен"};
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < menu.length; i++)
            System.out.println((i + 1) + ". " + menu[i]);

        System.out.print("Введите номер блюда: ");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice < 1 || choice > menu.length)
                throw new IllegalArgumentException("Вы ввели неверный номер блюда!");
            System.out.println("Вы выбрали: " + menu[choice - 1]);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
