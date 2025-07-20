package records.aizat;

public record Car( String brand, int year, boolean isElectric) {
    public Car{
        if (year < 1886) {
            System.out.println("Ката: Жылы 1886 жылдан кичине болбошу керек");
        }
    }

}
