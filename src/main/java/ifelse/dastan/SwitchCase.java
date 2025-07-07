package ifelse.dastan;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("Бугунку кунду жазыныз:") ;
        int days = scanner.nextInt();
        switch (days ){
            case 1:
                System.out.println("Бугун кунго  <<Дуйшонбу>>") ;
                break;
            case 2:
                System.out.println("Бугун кунго  <<Шейшемби>>") ;
                break;
            case 3 :
                System.out.println("Бугун кунго  <<Шаршемби>>") ;
                break;
            case 4:
                System.out.println("Бугун кунго  <<Бейшемби>>") ;
                break;
            case 5:
                System.out.println("Бугун кунго  <<Жума>>") ;
                break;
            case 6:
                System.out.println("Бугун кунго  <<Ишемби>>") ;
                break;
            case 7:
                System.out.println("Бугун кунго  <<Жекшемби>>") ;
                break;
            default: System.out.println("<<Мындай күн жок>>") ;
                break;
        }

    }

}

