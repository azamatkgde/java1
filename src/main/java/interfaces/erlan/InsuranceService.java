package interfaces.erlan;

public interface InsuranceService {
    void createInsurancePolicy(String clientName);
    void processClaim(int policyNumber);
}

