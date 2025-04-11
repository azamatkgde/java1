package basics.baima;

public class Patient extends clinicVedanta {
    private String diagnose;
    private double treatmentCost;
    public Patient(String name, int age, String gender, String diagnose, double treatmentCost) {
        super(name, age, gender);
        this.diagnose = diagnose;
        this.treatmentCost = treatmentCost;
    }
    public String getDiagnose() {
        return diagnose;
    }
    public double getTreatmentCost() {
        return treatmentCost;
    }
    public void printInfo() {
        System.out.println("Аты: " + getName());
        System.out.println("Жашы: " + getAge());
        System.out.println("Жынысы: " + getGender());
        System.out.println("Диагнозу: " + diagnose);
        System.out.println("Дарылоо баасы: $" + treatmentCost);
        System.out.println("------------------------");
    }
}
