package collections.aibek;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetCities {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> uniqueCities = new HashSet<>();

        System.out.println("\nШаарларды киргизиңиз (бүтүш үчүн 'end' деп жазыңыз):");
        while (true){
            String city = scanner.nextLine();
            if (city.equalsIgnoreCase("end")) break;
            uniqueCities.add(city);

        }
        System.out.println("Уникалдуу шаарлар: " + uniqueCities);


    }
}
