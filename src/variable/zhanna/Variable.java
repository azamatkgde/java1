package variable.zhanna;

public class Variable {
    public static void main(String[] args) {
        //Анкета с переменными (String, int, boolean)
        String name = "Zhanyl";
        int age = 27;
        boolean girl= true;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("She is girl: " + girl);
        //Примитивдик типтер менен эксперимент (byte, short, int, long) - MAX чыгаруу.
        byte maxByte = Byte.MAX_VALUE;
        short maxShort = Short.MAX_VALUE;
        int maxInt = Integer.MAX_VALUE;
        long maxLong = Long.MAX_VALUE;

        System.out.println("Max byte: " + maxByte);
        System.out.println("Max short: " + maxShort);
        System.out.println("Max int: " + maxInt);
        System.out.println("Max long: " + maxLong);
        //Арифметикалык операциялар (+, -, *, /, %)
        int a = 15;
        int b = 4;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));


        //Логикалык шарт (if/else жаш курагы боюнча)
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

    }
}
