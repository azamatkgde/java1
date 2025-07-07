package basics.baima;
import basics.baima.Patient;
import java.util.Scanner;
public class ClinicApp {
    static Patient[] patients = new Patient[100];
    static int patientCount = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("----- КЛИНИКА МЕНЮ -----");
            System.out.println("1. Жаңы пациент кошуу");
            System.out.println("2. Баардык пациенттерди көрсөтүү");
            System.out.println("3. Жалпы дарылоо баасын эсептөө");
            System.out.println("4. Эң кымбат дарылоо");
            System.out.println("5. Чыгуу");
            System.out.print("Тандооңуз: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Enterline
            switch (choice) {
                case 1 -> addPatient(scanner);
                case 2 -> showAllPatients();
                case 3 -> System.out.println("Жалпы дарылоо баасы: $" + getTotalTreatmentCost());
                case 4 -> findExpensiveTreatment();
                case 5 -> {
                    System.out.println("Программа жабылды.");
                    running = false;
                }
                default -> System.out.println("Туура эмес тандоо.");
            }
        }
    }

    public static void addPatient(Scanner scanner) {
        System.out.print("Аты: ");
        String name = scanner.nextLine();
        System.out.print("Жашы: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Жынысы (М/Ж): ");
        String gender = scanner.nextLine();
        System.out.print("Диагноз: ");
        String diagnose = scanner.nextLine();
        System.out.print("Дарылоо баасы: ");
        double cost = scanner.nextDouble();
        scanner.nextLine();

        patients[patientCount] = new Patient(name, age, gender, diagnose, cost);
        patientCount++;
        System.out.println("Пациент ийгиликтүү кошулду!");
    }
    public static void showAllPatients() {
        if (patientCount == 0) {
            System.out.println("Пациенттер жок.");
            return;
        }
        for (int i = 0; i < patientCount; i++) {
            patients[i].printInfo();
        }
    }
    public static double getTotalTreatmentCost() {
        double total = 0;
        for (int i = 0; i < patientCount; i++) {
            total += patients[i].getTreatmentCost();
        }
        return total;
    }
    public static void findExpensiveTreatment() {
        if (patientCount == 0) {
            System.out.println("Пациенттер жок.");
            return;
        }
        Patient expensive = patients[0];
        for (int i = 1; i < patientCount; i++) {
            if (patients[i].getTreatmentCost() > expensive.getTreatmentCost()) {
                expensive = patients[i];
            }
        }
        System.out.println("Эң кымбат дарылоо:");
        expensive.printInfo();
    }
}
