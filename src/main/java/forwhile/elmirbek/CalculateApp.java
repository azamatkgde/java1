package forwhile.elmirbek;

// Задача калькулятор

import java.util.Scanner;

public class CalculateApp {
    public static void main(String[] args) {

        // while работает после условия пока не будет истинны

      int calculate1 = 1;
      while (calculate1 <= 10){
          int b = 5;
          System.out.println(calculate1 + "*" + b + "=" + (calculate1 * b));
          calculate1++;
      }

      int calculate2 = 1;
      while (calculate2 <= 10) {
          int c = 9;
          System.out.printf("%d * %d = %d \n",calculate2, c, calculate2 * c);
          calculate2++;
      }
        System.out.println("Программа завершилась !!! ");


      // do - предназначен чтобы дейсвтие внутри тела завершилось только один раз (теория)


        // 📌 Проверка
        // ❓ Цикл do while — сколько раз он выполняется?
        // 🔹 Минимум: один раз
        // 🔹 Максимум: столько раз, сколько условие остаётся true


        // do
        int a = 5;
        do {
            System.out.println("a >>> " + a);
            a++;
        } while (a <= 40);

        // проверка с String

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("выход")) {
            System.out.println("Ведите что угодно если хотите выйти то нажмите <<<выход>>>   ");
            input = scanner.nextLine();
            System.out.println("Вы написали >>> " + input);
        }
        System.out.println("Программа завершилась");
        System.out.println("Идет следющая программа");

        // проверка с int
//
//       Scanner scanner1 = new Scanner(System.in);
        int number = -1;
        while (number != 0) {
            System.out.println("Напишите любые числа если хотите выйти нажмите 0 ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            } else {
                System.out.println("Программа не должна соддержать числа а только строку !!! ");
                scanner.next();
            }
        }
        System.out.println("Программа завершилась !!! ");
        scanner.close();
    }
}

