package variable.aibek;

public class Variables {

    public static void main(String[] args) {

        String firstName = "Айбек ";
        String lastName = "Арстанбеков ";
        int age = 27;
        boolean hasJob = true ;
        boolean isStudent = false ;
        boolean likeCoding = true ;

        System.out.println("Жыйынтык: ");
        System.out.println("Менин атым " + firstName + lastName ) ;
        System.out.println("Жашым " + age ) ;
        System.out.println("Менин жумушум барбы? " + hasJob  ) ;
        System.out.println( "Мен студентминби? " + isStudent ) ;
        System.out.println("Код жазганды жакшы коросунбу? " +  likeCoding ) ;


        // Арифметикалык операторлор
        int groupA = 15;
        int groupB = 10;
        int sum = groupA + groupB ;
        System.out.println("Жыйынтык: ");
        System.out.println("Java A жана Java B жалпы студенттердин саны: " + sum ) ;
        System.out.println("Айырма: "+ (groupA - groupB)) ;
        System.out.println("Кобойтуу: " + (groupA * groupB)) ;
        System.out.println("Болуу: " + (groupA / groupB ));
        System.out.println("Калдык: " +(groupA % groupB ));

        // Салыштыруу операторлор
        int x = 100;
        int y = 50;
        System.out.println("Жыйынтык: ") ;
        System.out.println("100 барабар эмес 50 ке: "+ (x == y)); // false 100 барабар эмес 50 ке
        System.out.println("100 50ке барабар эмес: "+ (x != y));
        System.out.println("100 кичинеби 50 дон: "+ (x <y)) ;
        System.out.println("100 чонбу 50дон: "+(x>y)) ;
        System.out.println("100 чон жэ барабарбы 50 го: "+(x >= y)) ;
        System.out.println("100 кичинеби жэ барабарбы 50го: "+(x <= y)) ;


        // Логикалык операторлор

        boolean  a = true ;
        boolean b = false ;
        System.out.println("Жыйынтык") ;
        System.out.println(a && b); // false a жана b экоо тен true эмес
        System.out.println(a || b ) ;// true   экоонун бироосу true болсо ,true кайтарат,
        System.out.println(!a) ; // false , карама каршыга айландырып берет true болсс false кылып коют
        System.out.println(!b) ; // true , карама каршыга айландырып берет false болсс true кылып коют

        int c = 20;
        int d = 30;
        System.out.println("Жыйынтык") ;
        System.out.println( c > 15 && d < 40) ; //true экоо тен туура c >15 тен чон , d < 40 кичине
        System.out.println(c == 20 || d > 10) ; //true  экоонун бироосу true болсо

    }
}
