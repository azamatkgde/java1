package collections.zhanna;
import java.util.*;

public class CitySet {
    public static void main(String[] args) {
        Set<String> cities = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("3 уникалдуу шаар киргизиңиз:");
        int count = 0;
        while (count < 3) {
            System.out.print((count + 1) + "-шаар: ");
            String city = scanner.nextLine();
            boolean added = cities.add(city);

            if (added) {
                count++;
            } else {
                System.out.println("Бул шаар мурда эле кошулган, башкасын жазыңыз.");
            }
        }

        System.out.println("Сиз киргизген шаарлар: " + cities);
    }
}

