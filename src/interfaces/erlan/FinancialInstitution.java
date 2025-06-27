package interfaces.erlan;

public class FinancialInstitution implements BankService, InsuranceService {

    @Override
    public void openBankAccount(String clientName) {
        System.out.println("Банковский счет открывается на имя: " + clientName);
    }

    @Override
    public void processLoan(double amount) {
        System.out.println("Обработанный заем на сумму: $" + amount);
    }

    @Override
    public void createInsurancePolicy(String clientName) {
        System.out.println("Страховой полис на имя: " + clientName);
    }

    @Override
    public void processClaim(int policyNumber) {
        System.out.println("Заявка на получение номера полиса: " + policyNumber);
    }
}

