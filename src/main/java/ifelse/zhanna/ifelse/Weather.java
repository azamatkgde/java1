package ifelse.zhanna.ifelse;

import java.util.Scanner;

public class Weather {
 /*   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Температураны киргизиңиз: ");
        int temperature = scanner.nextInt();

        if (temperature > 30) {
            System.out.println("Аба ыссык. Жеңил кийим кииңиз.");
        } else if (temperature >= 0 && temperature <= 30) {
            System.out.println("Кадимки кийим кииңиз.");
        } else {
            System.out.println("Аба суук. Жылуу кийим кииңиз.");
        }

        scanner.close();
    }*/
 public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     System.out.print("Температураны киргизиңиз: ");
     int t = s.nextInt();
     System.out.println(t > 30 ? "Аба ыссык. Жеңил кийим кииңиз." : (t >= 0 ? "Кадимки кийим кииңиз." : "Аба суук. Жылуу кийим кииңиз."));
     s.close();
 }
}
