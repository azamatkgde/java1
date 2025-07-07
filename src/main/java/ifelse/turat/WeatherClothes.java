package ifelse.turat;

import java.util.Scanner;

public class WeatherClothes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Температураны киргизиңиз: ");
        int temperature = scanner.nextInt();

        if (temperature > 30) {
            System.out.println("Аба ысык. Жеңил кийиниңиз.");
        } else if (temperature >= 0) {
            System.out.println("Өтө жеңил эмес кийиниңиз.");
        } else {
            System.out.println("Аба суук. Жылуу кийиниңиз.");
        }

        scanner.close();
    }
}
