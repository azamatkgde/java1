package methods.askar;
class MetoddorMisaldar {
    public static void main(String[] args) {
        // Параметрсиз методду чакыруу
        salamBer();

        // Параметри бар методду чакыруу
        salamBer("Аскар");

        // Натыйжа кайтарган методду чакыруу
        int summa = koshuu(5, 10);
        System.out.println("Сумма: " + summa);

        // Методдун ашыкча жүктөлүшүн (overloading) колдонуу
        System.out.println("Сумма (int): " + koshuu(5, 10));
        System.out.println("Сумма (double): " + koshuu(5, 10.2));

        // Рекурсия менен факториалды эсептөө
        System.out.println("Факториал 5: " + factorial(5));

        // Ар кандай сандагы параметрлер менен иштеген метод
        System.out.println("Сумма varargs: " + summaEsepte(1, 2, 3, 4, 5));
    }

    // Параметрсиз метод
    public static void salamBer() {
        System.out.println("Салам Кыргызстан");
    }

    // Бир параметри бар метод
    public static void salamBer(String at) {
        System.out.println("Салам, " + at + "!");
    }

    // Эки санды кошкон метод
    public static int koshuu(int a, int b) {
        return a + b;
    }

    // Overloading - Double сандар менен иштөө
    public static double koshuu(double a, double b) {
        return a + b;
    }

    // Рекурсивдик метод (факториалды эсептөө)
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Ар кандай сандагы параметрлер менен иштеген метод (varargs)
    public static int summaEsepte(int... sandar) {
        int jyiyn = 0;
        for (int san : sandar) {
            jyiyn += san;
        }
        return jyiyn;
    }
}
