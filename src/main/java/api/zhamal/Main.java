package api.zhamal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MovieAPI movieAPI = new MovieAPI(); // Бул биздин “API”

        System.out.println("Кайсы тасма жөнүндө билгиң келет?");
        String title = scanner.nextLine();

        // Бул жерде биз “APIге” суроо жөнөтөбүз
        String result = movieAPI.getMovieInfo(title);

        // Жоопту алабыз
        System.out.println("API Жооп:");
        System.out.println(result);

        scanner.close();
    }
}


