package forwhile.elmirbek;

public class NumbersInsideTheLoop {
    public static void main(String[] args) {

        // 2 цифры нужно сделать снаружий и внутрий

        // 🔹 for

        for (int i = 0; i <= 3; i++) {
            System.out.println("Снаружи :  " + i);
            for (int j = 0; j <= 5; j++ ) {
                System.out.println("Внутри : " + j);
            }
        }

        // 🔹 while

        int a = 1;
        while (a <= 3) {
            System.out.println("Снаружи : " + a);
            int b = 1;
            while (b <= 5){
                System.out.println("Внутри : " + b);
                b++;
            }
            a++;
            }
        }
    }


