package forwhile.zhanna.dowhile;

public class Massive {
    public static void main(String[] args) {
        int i = 1;

      /*  do {
            int j = 1;
            while (j <= 5) {
                System.out.println("i = " + i + ", j = " + j);
                j++;
            }
            i++;
        } while (i <= 3);*/
        do {
            int j = 1;
            while (j <= 5) System.out.println("i = " + i + ", j = " + j++);
            i++;
        } while (i <= 3);
    }
}
