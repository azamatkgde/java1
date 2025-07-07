package ifelse.aibek;

import java.util.Scanner;

public class IfElse {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in );
    System.out.println("Тесттен канча балл алдыныз: ");
    int ball = scanner.nextInt() ;
    if (ball >=90 && ball <=100 ){
        System.out.println("Азаматсыз сиз <5> алдыныз ") ;
    } else if (ball >= 70 && ball <=89 ) {
        System.out.println("Жакшы ,Сиз 4 алдыныз ");
    } else if (ball >=50 && ball <= 69 ) {
        System.out.println("Канааттандыраарлык, <3> деген баа алдыныз. ") ;
    } else if (ball >=0  &&  ball <= 49 ) {
        System.out.println("Жакшылап даярданыныз. Сиз <2> алдыңыз. ") ;
    }else {
        System.out.println(" Сиз экзаменге кирген жоксуз же балл туура эмес. ");
    }
}

}
