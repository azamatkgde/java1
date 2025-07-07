package interfaces.erlan;

public interface BankService {
    void openBankAccount(String clientName);
    void processLoan(double amount);
}
