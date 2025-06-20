package interfaces.erlan;

public class Main {
    public static void main(String[] args) {
        FinancialInstitution company = new FinancialInstitution();

        // Работа как банк
        company.openBankAccount("Өмүрбек Аксайбек");
        company.processLoan(14000);

        // Работа как страховая компания
        company.createInsurancePolicy("Өмүрбек Аксайбек");
        company.processClaim(22556644);
    }
}