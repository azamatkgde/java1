package variable.sezim;

public class variable {
    public static void main(String[]args){
        String greating="Hi";
        String firstName="Sezim";
        String lastName="Satarova";
        int myAge= 25;
        boolean hasJob= true;

        System.out.println("" + greating + ",My name is " + firstName + " " +lastName+".");
        System.out.println("I am "+myAge+" years old");
        System.out.println("do you have a job? " + hasJob + ", yeas" );
        int ageA=25;int ageB=23;
        if(ageA>ageB){
            System.out.println("yes,real age");

            //Арифметические операторы
            int a=15;
            int b=7;
            System.out.println("Сложение: " + (a + b));      // 12
            System.out.println("Вычитание: " + (a - b));     // 4
            System.out.println("Умножение: " + (a * b));     // 32
            System.out.println("Деление: " + (a / b));       // 2
            System.out.println("Остаток: " + (a % b));

            //Примитивные типы
            byte maxByte=Byte.MAX_VALUE;;
            short maxShort=Short.MAX_VALUE;
            int maxInt= Integer.MAX_VALUE;
            long maxLong=Long.MAX_VALUE;

            System.out.println("max.znach byte"+maxByte );
            System.out.println("max.znach short"+maxShort);
            System.out.println("max.znach int"+maxInt);
            System.out.println("max.znach long"+maxLong);

                    ;
        }

    }

}
