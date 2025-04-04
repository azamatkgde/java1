package forwhile.zhanyl;

import java.util.Scanner;

public class ForWhile {
    //Обратный порядок
    public static void main(String[] args) {
            for (int i=10; i >=1; i --){
                System .out .println("Сан:" + i);
            }
            //2. Таблица умножения
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " × " + i + " = " + (n * i));
            }
            //Запрашивать числа, пока не введут 0
            int number;
            do {
                System .out .println("Введите число(0 для выхода)");;
                number =scanner.nextInt() ;
                if (number !=0){
                    System .out .println("Вы ввели" + number );
                }
            }while (number !=0);
            scanner.close();
            //Вложенный while (i = 1 до 3, j = 1 до 5)
            int i=1;
            while (i<=3){
                int j=1;
                System .out .println("i=" +i );
                while (j<=5){
                    System .out .println("j=" +j );
                    j++;
                }
                i ++;
            }
        }
    }


