package ifelse.elmirbek;
import java.util.Scanner;

// основные задачи программы

//1 → «Калькуляторго өтүү»
//
//2 → «Курстар тизмесин көрүү»
//
//3 → «Чыгуу»



public class menuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Биздин программа га кош келиниз !!! ");
        System.out.println("Биздин программа да эки тандоо бар ");
        System.out.println("1 → «Калькуляторго өтүү»");
        System.out.println("2 → «Курстар тизмесин көрүү»");
        System.out.println("3 → «Чыгуу»");
        System.out.println("Сиздин тандоонуз : ");
        int menu = scanner.nextInt();
        switch (menu){
            case 1:
                System.out.println("Калькулятор программасына кош келиниз !!! ");
                System.out.println("Биринчи сан : ");
                double number1 = scanner.nextDouble();
                System.out.println("Экинчи сан : ");
                double number2 = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Оператор танданыз : (+), (-) (*) (/) (%)");
                String ops = scanner.nextLine();
               if(ops.equals("+")){
                   System.out.printf("Жооп : %f \n ", number1 + number2);
               }  else if (ops.equals("-")){
                   System.out.printf("Жооп : %f \n", number1 - number2);
               } else if (ops.equals("*")) {
                   System.out.printf("Жооп : %f \n", number1 * number2);
               } else if (ops.equals("/")) {
                   System.out.printf("Жооп : %f \n", number1 / number2);
               } else if (ops.equals("%")){
                   System.out.printf("Жооп : %f \n", number1 / number2);
               }
               else {
                   System.out.println("Туура оператор менен иштениз сураныч !!!");
               }
            case 2:
                System.out.println("Курстардын тизменисине кош келиниз !!! ");
                System.out.println("Биздин курста 3 багыт бар");
                System.out.println("1 → «Java developer»");
                System.out.println("2 → «Python developer»");
                System.out.println("3 → «Flutter developer»");
                System.out.println("Сиздин тандоонуз : ");
                int cource = scanner.nextInt();
                switch (cource){
                    case 1:
                        System.out.println("Java курсуна кон келиниз");
                        break;
                    case 2:
                        System.out.println("Python курсуна кош келиниз");
                        break;
                    case 3:
                        System.out.println("Flutter курсуна кош келиниз");
                        break;
                    default:
                        System.out.println("Бизде башка ашыкча курстар жок жакында ачылат !!! ");
                }
               break;
            default:
                System.out.println("Рахмат кош болунуз !!! ");
        }
    }
}
