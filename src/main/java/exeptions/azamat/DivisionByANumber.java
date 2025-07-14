package exeptions.azamat;

public class DivisionByANumber {
    public static int getDevisionByANumber(int a, int b) {
        int devisionResult = 0;

        try {
            devisionResult = a / b;
            return devisionResult;
        } catch (ArithmeticException e) {
            System.out.println("Ката! 0го бөлүп жатабыз! b = 0го барабар");
        }

        System.out.println("Сонун идеябыз менен жашообуз пландалган!");
        return devisionResult;
    }

    public static void getName() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Ката: Обект жасалган жок!");
        } finally {
            System.out.println("Болбой эле програманны жасай бер!");
        }
    }

    public static void getInput(String input) throws MyExeption {
        if (input.equals("")) {
            throw new MyExeption("Текст болуш керек!");
        }
    }

    public static void main(String[] args) throws MyExeption {
        int devision = getDevisionByANumber(10, 0);
        System.out.println(devision);
        getName();
    }
}

