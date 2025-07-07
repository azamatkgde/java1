package forwhile.zhanna.whilejava;

public class Massive {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 3) {
            int j = 1;
            while (j <= 5) {
                System.out.println("i = " + i + ", j = " + j);
                j++;
            }
            i++;
        }

       /* while (i <= 3) {
            int j = 1;
            while (j <= 5) System.out.println("i = " + i + ", j = " + j++);
            i++;
        }*/
    }
}
