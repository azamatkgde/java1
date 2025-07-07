package ifelse.aibek;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        int days = 8;
        System.out.println("Бугун:") ;
        switch (days ){
            case 1:
                System.out.println("Дүйшөмбү") ;
                break;
            case 2:
                System.out.println("Шейшемби") ;
                break;
            case 3 :
                System.out.println("Шаршемби") ;
                break;
            case 4:
                System.out.println("Бейшемби") ;
                break;
            case 5:
                System.out.println("Жума") ;
                break;
            case 6:
                System.out.println("Ишемби") ;
                break;
            case 7:
                System.out.println("Жекшемби") ;
                break;
            default: System.out.println("Белгисиз кун") ;
                break;
        }

    }

}
