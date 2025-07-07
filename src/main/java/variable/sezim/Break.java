package variable.sezim;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Выбери день недели:\n " +
                " 1 - Понедельник \n " +
                " 2 - Вторник \n "+
                " 3 - Среда \n " +
                " 4 - Четверг \n "+
                " 5 - Пятница \n "+
                " 6 - Суббота \n " +
                " 7 - Воскресенье ");

        int day = s.nextInt();

        switch(day){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3 :
                System.out.println("Среда");
                break;
            case  4:
                System.out.println("Четверг");
                break;
            case  5:
                System.out.println("Пятница");
                break;
            case 6 :
                System.out.println("Суббота");
                break;
            case 7 :
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неправильный выбор");
        }
    }
}
