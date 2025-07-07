package arrays.begimai;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] patient = {45, 67, 78, 98, 34};
        int komnata = java.util.Arrays.binarySearch(patient, 98);
        System.out.println("pat zimmer?" + komnata);

        int[] pesonal = {2, 5, 20, 45};
        int summa = 0;
        for (int a : pesonal) {
            summa += a;
        }

        System.out.println("Gesamt personal? " + summa);


        int min = patient[0];
        for (int i = 1; i < patient.length; i++) {
            if (patient[i] < min) {
                min = patient[i];
            }
        }

        System.out.println("min: " + min);

    }
}
