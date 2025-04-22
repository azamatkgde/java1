package methods.askar;

public class TakJuup {
    public static void main(String[] args) {
        int san = 7;
        if (juupbu(san)) {
            System.out.println(san + " жуп сан.");
        } else {
            System.out.println(san + " так сан.");
        }
    }

    public static boolean juupbu(int san) {
        return san % 2 == 0;
    }
}