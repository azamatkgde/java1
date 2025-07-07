package methods.meerim;

import java.util.Scanner;

public class Utility {

        public static int chiediInt(String msg) {
            Scanner input = new Scanner(System.in);
            int n;
            do {
                System.out.println(msg);
                n = input.nextInt();
            } while (n <= 0);
            return n;
        }

    public static String chiediString(String s) {
        Scanner input = new Scanner(System.in);
        String n;
        do {
            System.out.println(s);
            n = input.nextLine();
        } while (n.trim().isEmpty());
        return n;
    }
}

