package variable.nursultan;

import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        // Что такое переменная?
        // Переменная — это именованная область памяти,
        // в которой хранится значение определенного типа.
        // Она может быть изменена в процессе выполнения программы.

        int age = 20;
        String name = "Nursultan";
        System.out.println("Салам менин атым " + name + " " + age + " жаштамын");

        // Типы данных
        // Есть два вида типов данных это приметивные и ссылочные

        //  Приметивные это:
        //  Тип	    Размер	 Значения	                        Пример
        //  byte	1 байт	 -128 до 127	                    byte a = 100;
        //  short	2 байта	 -32,768 до 32,767	                short s = 5000;
        //  int	    4 байта	 -2^31 до 2^31-1	                int i = 1_000_000;
        //  long	8 байт	 -2^63 до 2^63-1	                long l = 9_000_000_000L;
        //  float	4 байта	 6-7 значащих цифр после запятой	float f = 5.75f;
        //  double	8 байт	 15 знаков после запятой	        double d = 19.99;
        //  char	2 байта	 Символ Unicode	                    char c = 'J';
        //  boolean	1 байт	 true или false	                    boolean isOn = true;

        System.out.println(" ");
        System.out.println("Типтердин MAX чыгаруу");
        System.out.println("byte: " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MAX_VALUE);
        System.out.println("Char: " + (int) Character.MAX_VALUE);

        System.out.println(" ");
        //  Ссылочные типы данных
        String aiName = "AkylAi";      // строка — объект
        int[] numbers = {1, 2, 3, 4};   // массив

        System.out.println(aiName + " дын чыкканына " + numbers[2] + " жыл болду");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Биринчи сан жазыныз:");
        int num = scanner.nextInt();

        System.out.println("Экинчи сан жазыныз");
        int num2 = scanner.nextInt();

        System.out.println("Кошуу: " + (num + num2));
        System.out.println("Кемитуу: " + (num - num2));
        System.out.println("Кобойтуу: " + (num * num2));

        if (num2 != 0 ) {
            System.out.println("Болуу: " + (num / num2));
            System.out.println("Калдык: " + (num % num2));
        } else {
            System.out.println("Ката 0 го болууго болбойт");
        }

        scanner.close();
    }
}
