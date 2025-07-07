package variable.meerim.CreditApplication;

public class CreditDetails {
    private double desiredAmount;
    private int termInMonths;
    private String purpose;
    private boolean hasCurrentCredits;
    private double totalMonthlyPayments;

    public CreditDetails() {

    }

    public CreditDetails(double desiredAmount, int termInMonths, String purpose, boolean hasCurrentCredits, double totalMonthlyPayments) {
        this.desiredAmount = desiredAmount;
        this.termInMonths = termInMonths;
        this.purpose = purpose;
        this.hasCurrentCredits = hasCurrentCredits;
        this.totalMonthlyPayments = totalMonthlyPayments;
    }

    public double getDesiredAmount() {
        return desiredAmount;
    }

    public void setDesiredAmount(double desiredAmount) {
        this.desiredAmount = desiredAmount;
    }

    public int getTermInMonths() {
        return termInMonths;
    }

    public void setTermInMonths(int termInMonths) {
        this.termInMonths = termInMonths;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public boolean isHasCurrentCredits() {
        return hasCurrentCredits;
    }

    public void setHasCurrentCredits(boolean hasCurrentCredits) {
        this.hasCurrentCredits = hasCurrentCredits;
    }

    public double getTotalMonthlyPayments() {
        return totalMonthlyPayments;
    }

    public void setTotalMonthlyPayments(double totalMonthlyPayments) {
        this.totalMonthlyPayments = totalMonthlyPayments;
    }

    @Override
    public String toString() {
        return "desiredAmount:" + desiredAmount + "\n"+
                "termInMonths:" + termInMonths + "\n"+
                "purpose:" + purpose + "\n"+
                "hasCurrentCredits:" + hasCurrentCredits + "\n"+
                "totalMonthlyPayments:" + totalMonthlyPayments + "\n";

    }
}



