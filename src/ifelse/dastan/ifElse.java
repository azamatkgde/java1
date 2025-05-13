package ifelse.dastan;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Балынызы жазыныз (0–100): ");
        int ball = scanner.nextInt();
        if (ball >= 90 && ball <= 100) {
            System.out.println("Бааныз <<5>> ");
        } else if (ball >= 70 && ball <= 89) {
            System.out.println("Бааныз <<4>>");
        } else if (ball >= 50 && ball <= 69) {
            System.out.println("Бааныз <<3>>");
        } else if (ball >= 0 && ball <= 49) {
            System.out.println("Бааныз <<2>>");
       }  else {
            System.out.println("0дөн 100гө чейинки гана санды жазыныз.");
        }
    }
}