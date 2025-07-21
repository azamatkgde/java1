package records.yryskeldi;

public record Car(String brand, int year, boolean isElectric) {
    public Car {
        if (year < 1886) {
            throw new IllegalArgumentException("Жыл 1886дан кичине болбошу керек.");
        }
    }
}