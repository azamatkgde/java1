package variable.elmirbek;

public class Variable {
    public  static  void main (String[] args) {

        // про себя
        String firstName = "Элмирбек";
        String lastName = "Абдуманапов";
        int age = 19;
        boolean hasJob = true;
        boolean isStudent = true;
        boolean lovesJava = true;
        boolean lovesPython = false;

        byte groupJavaA = 10;
        byte groupJavaB = 20;

        // арифметика
        double number1 = 20.5;


        // вывод
        System.out.println("Имя : " + firstName);
        System.out.println("Фамилия : " + lastName);
        System.out.println("Возраст : " + age);
        System.out.println("Работает : " + hasJob);
        System.out.println("Студент : " + isStudent);
        System.out.println("Фанат Java : " + lovesJava);
        System.out.println("Фанат Python : " + lovesPython);

        System.out.println("Колличество студентов в групах JavaA и JavaB >>>  " + (groupJavaA + groupJavaB) + " студентов");


        // вывод (MAX, MIN)
        System.out.println("Byte MAX : " + Byte.MAX_VALUE);
        System.out.println("Byte MIN : " + Byte.MIN_VALUE );
        System.out.println("Short MAX : " + Short.MAX_VALUE);
        System.out.println("Short MIN : " + Short.MIN_VALUE);
        System.out.println("Int MAX : " + Integer.MAX_VALUE );
        System.out.println("Int MIN : " + Integer.MIN_VALUE);
        System.out.println("Long MAX : " + Long.MAX_VALUE);
        System.out.println("Long MIN : " + Long.MIN_VALUE);
        System.out.println("Double MAX : " + Double.MAX_VALUE);
        System.out.println("Double MIN : " + Double.MIN_VALUE);






    }
}
