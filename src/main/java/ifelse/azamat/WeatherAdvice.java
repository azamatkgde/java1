package ifelse.azamat;

import java.util.Scanner;

public class WeatherAdvice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Температураны киргизиңиз (Цельсий градус менен): ");
        int temperature = scanner.nextInt();

        if (temperature > 30) {
            System.out.println("Аба ырайы өтө ысык. Жеңил кийим кийиңиз.");
        } else if (temperature >= 0) {
            System.out.println("Кадимки кийим кийиңиз.");
        } else {
            System.out.println("Аба ырайы суук. Жылыныраак кийим кийиңиз.");
        }

        scanner.close();
    }
}