package variable.meerim.CreditApplication;

public class EmploymentInfo {
    private String companyName;
    private String position;
    private int experienceInMonths;
    private double monthlyIncome;
    private boolean officiallyEmployed;

    public EmploymentInfo() {
    }

    public EmploymentInfo(String companyName,String position,int experienceInMonths,double monthlyIncome,boolean officiallyEmployed) {
        this.companyName = companyName;
        this.position = position;
        this.experienceInMonths = experienceInMonths;
        this.monthlyIncome = monthlyIncome;
        this.officiallyEmployed = officiallyEmployed;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPosition() {
        return position;
    }

    public int getExperienceInMonths() {
        return experienceInMonths;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public boolean isOfficiallyEmployed() {
        return officiallyEmployed;
    }

    @Override
    public String toString() {
        return "companyName:" + companyName + "\n"+
                " position:" + position + "\n"+
                " experienceInMonths:" + experienceInMonths +"\n"+
                " monthlyIncome:" + monthlyIncome +"\n"+
                " officiallyEmployed:" + officiallyEmployed +"\n";
                }
    }

