package variable.elmirbek;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;
        boolean running = true;
        System.out.println("Кыргызстан банк кош келиниз  !!! ");
        while (running) {
            System.out.println("Сизге керектуу пункту танданыз ");
            System.out.println("1 Баланс текшеруу ");
            System.out.println("2 Баланс толуктоо ");
            System.out.println("3 Баланс чыгарып алуу");
            System.out.println("4 Чыгуу ");
            System.out.println("Сиздин тандоонуз : ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // посмотреть
                    System.out.printf("Сиздин баланс : %.2f \n", balance);
                    break;
                case 2:
                    // пополнить
                    System.out.println("Сизге керектту сумманы жазыныс : ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 10) {
                        balance += deposit;
                        System.out.printf("Баланс толукталды! Сизге керектуу баланс :  %.2f \n", balance);
                    } else {
                        System.out.println("Баланс 10 сомдон жогору толуктоо зарыл !!!  ");
                    }
                    break;
                case 3:
                    // снятие
                    System.out.println("Баланс алуу үчүн сумманы киргизиңиз: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw > 10 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.printf("Баланс алуу ийгиликтүү аяктады. Эсептеги калдык: %.2f сом \n", balance);
                    } else {
                        System.out.println("Каражат жетишсиз же сумма туура эмес.");
                    }
                    break;
                case  4:
                    running = false;
                    System.out.println("Банкыбызды пайдаланганыңыз үчүн рахмат. Кош болуңуз!");
                    break;
                default:
                    System.out.println("Туура эмес тандоо. Сураныч, дагы бир жолу аракет кылыңыз.");
            }
        }
        scanner.close();
    }
}

