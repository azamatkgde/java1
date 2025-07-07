package forwhile.turat;

public class NestedWhileLoop {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 3) {
            int j = 1;
            System.out.println("Сырткы цикл i = " + i + ":");

            while (j <= 5) {
                System.out.println("  Ички цикл j = " + j);
                j++;
            }

            System.out.println(); // Бош сап
            i++;
        }

        System.out.println("Бардык циклдер аяктады.");
    }
}
