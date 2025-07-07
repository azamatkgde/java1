package variable.azamat;

public class DataTypesExperiment {
    public static void main(String[] args) {
        // Объявляем переменные разных типов
        byte byteValue = 127; // Максимальное значение byte
        short shortValue = 32_000;
        int intValue = 2_000_000;
        long longValue = 9_000_000_000L; // Суффикс L для long

        // Выводим переменные
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);

        // Проверяем максимальные и минимальные значения
        System.out.println("\nМакс./Мин. значения:");
        System.out.println("Byte: " + Byte.MIN_VALUE + " до " + Byte.MAX_VALUE);
        System.out.println("Short: " + Short.MIN_VALUE + " до " + Short.MAX_VALUE);
        System.out.println("Int: " + Integer.MIN_VALUE + " до " + Integer.MAX_VALUE);
        System.out.println("Long: " + Long.MIN_VALUE + " до " + Long.MAX_VALUE);
    }
}
